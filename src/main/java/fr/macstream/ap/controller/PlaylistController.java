package fr.macstream.ap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.macstream.ap.model.MovieEntity;
import fr.macstream.ap.repository.MovieRepository;
import fr.macstream.ap.repository.UserRepository;

@RestController
public class PlaylistController {
	@Autowired
	UserRepository userRepo;
	@Autowired
	MovieRepository filmRepo;
	@Autowired
	HomeController homeController;
	
	PlaylistController(){
		
	}
	//voir setMovieInPlayList dans le controller "FicheFilmController.java"
	
	@PostMapping("/playlist/addd")
	public boolean ajouterFilmPlaylist(@RequestParam int idFilm) {
		boolean filmAjout = false;
		
		/*
		 * rechercher le film dont l'id est passé en paramètre
		 */
		//Film film = filmRepo.findOne(idFilm);
		//user.getPlaylist().add(film);
			
		return filmAjout;
	}
	

	
}
