package fr.macstream.ap.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.macstream.ap.model.User;
import fr.macstream.ap.repository.UserRepository;

/**
 * 
 * @author ElMoNkoBo
 *
 */
@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	public UserController() {
		
	}
	
	@RequestMapping(value="/users/deconnecter", method=RequestMethod.GET)
	public boolean deconnecter(HttpSession session) {
		boolean estDeconnecte = false;
		Object userId = session.getAttribute("userid");
		if(userId != null) {
			session.invalidate();
			estDeconnecte = true;
		}
		return estDeconnecte;
	}
	
	@RequestMapping(value="/users/inscrire",method=RequestMethod.POST)
	public boolean inscrire(User user) {
		boolean estInscrit = false;
		if(userRepository.findByLogin(user.getLogin()) == null) {
			User nouvelInscrit = userRepository.save(user);
			if(nouvelInscrit != null)
				estInscrit = true;
		}
		
		return estInscrit;
	}
	
	@RequestMapping(value="users/connecter", method=RequestMethod.POST)
	public boolean connecter(HttpSession session, User user) {
		boolean estConnecte = false;
		User userConnecte = userRepository.findByLogin(user.getLogin());
		if(userConnecte != null) {
			if(userConnecte.getMotdepasse().equals(user.getMotdepasse())) {
				session.setAttribute("userid", userConnecte.getIdUser());
				estConnecte = true;
			}
		}
		return estConnecte;
	}
}
