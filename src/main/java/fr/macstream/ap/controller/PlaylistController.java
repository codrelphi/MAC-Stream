package fr.macstream.ap.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaylistController {
	//@Autowired
	//UserRepository userRepo;
	//FilmRepository filmRepo;
	
	PlaylistController(){
		
	}
	
	@PostMapping("/playlist/add")
	public boolean ajouterFilmPlaylist(@RequestParam int idFilm) {
		/*
		 * rechercher le film dont l'id est passé en paramètre
		 */
		//Film film = filmRepo.findOne(idFilm);
		//user.getPlaylist().add(film);
			
		return true;
	}
}
