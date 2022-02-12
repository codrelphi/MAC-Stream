package fr.macstream.ap.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import fr.macstream.ap.model.MovieEntity;
import fr.macstream.ap.model.PlayListsEntity;
import fr.macstream.ap.repository.MovieRepository;
import fr.macstream.ap.repository.PlayListsRepository;
import fr.macstream.ap.service.FilmService;
import net.bytebuddy.asm.Advice.This;


@Controller
public class FicheFilmController {

	@Autowired
	MovieRepository  movieRepository;
	@Autowired
	AuthenticateController authenticateController;
	
	@Autowired
	PlayListsRepository playListsRepository;
	
	@Autowired
	FilmService filmService;
	
	@GetMapping("/film/{idFilm}")
	public ModelAndView afficherFilm(@PathVariable int idFilm,  Model model, HttpSession session) {
		if(session.getAttribute("USER_CONNECTED_SESSION") == null) {
			return new ModelAndView("redirect:/home");
		}
		model.addAttribute("film",filmService.rechercheParId(idFilm));
		return new ModelAndView("ficheFilms");
	}

	@GetMapping("/playList/add")
	public ModelAndView setMovieInPlayList(@RequestParam int idFilm, @RequestParam int idUser, Model model) {
		boolean dejaEnregistre = false;
			
		List<PlayListsEntity> plBddList = playListsRepository.findAll();
		if(plBddList!=null) {
			for(PlayListsEntity plBdd : plBddList) {
				if(plBdd.getFilm().intValue() == idFilm &&  plBdd.getUser().intValue() ==idUser ) {
					dejaEnregistre = true;
				}
			}
			if(!dejaEnregistre) {
				PlayListsEntity plNouveau = new PlayListsEntity(idUser, idFilm);
				playListsRepository.save(plNouveau);
			}
		}
		 
		return new ModelAndView("redirect:/home");
//		MovieEntity filmFiche = movieRepository.getById(idFilm);
//		System.out.println("Playlist Film ="+idFilm + "   User = "+idUser);
//		model.addAttribute("film" , filmFiche);
//		return "ficheFilms";
	}
}