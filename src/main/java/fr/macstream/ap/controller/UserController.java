package fr.macstream.ap.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.macstream.ap.model.User;
import fr.macstream.ap.repository.UserRepository;
import fr.macstream.ap.service.UserService;


/**
 * 
 * @author ElMoNkoBo
 *
 */
@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;
	@Autowired
	private UserService userService;
	
	public UserController() {
		
	}
	
	@GetMapping(value="/user/deconnecter")
	public boolean deconnecter(HttpSession session) {
		boolean estDeconnecte = false;
		Object user = session.getAttribute("USER_CONNECTED_SESSION");
		if(user != null) {
			session.invalidate();
			estDeconnecte = true;
		}
		return estDeconnecte;
	}
	
	@PostMapping(value="/user/inscrire")
	public boolean inscrire(String login, String nom, String motdepasse,boolean sesouvenirdemoi) {
		return this.userService.inscription(login, nom, motdepasse,false );
	}
	
	@PostMapping(value="/user/connecter")
	public boolean connecter(HttpSession session, String login, String motdepasse) {
		boolean estConnecte = false;
		if(this.userService.authentification(login, motdepasse)) {
			session.setAttribute("USER_CONNECTED_SESSION",this.userService.connexion(login, motdepasse));
			estConnecte = true;
		}
		return estConnecte;
	}
	@PutMapping(value="/user/playlist/add/{idFilm}")
	public boolean ajouterFilm(HttpSession session,int idFilm) {
		boolean isMovieAdded = false;
		Object userObject = session.getAttribute("USER_CONNECTED_SESSION");
		if(userObject != null) {
			session.setAttribute("USER_CONNECTED_SESSION",
					userService.ajouterFilmPlaylist((User)userObject, idFilm));
			isMovieAdded = true;
		}
		return isMovieAdded;
	}
	
	@PutMapping(value="/user/playlist/remove/{idFilm}")
	public boolean retirerFilm(HttpSession session, int idFilm) {
		boolean isMovieRemoved = false;
		Object userObject = session.getAttribute("USER_CONNECTED_SESSION");
		if(userObject != null){
			session.setAttribute("USER_CONNECTED_SESSION",
					userService.retirerFilmPlaylist((User)userObject, idFilm));
			isMovieRemoved = true;
		}
		return isMovieRemoved;
	}
	
}
