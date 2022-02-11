package fr.macstream.ap.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.macstream.ap.clienthttp.SessionUser;

@Controller
public class AuthenticateController {

	@ResponseBody
	@GetMapping("/authenticate")
	public Boolean authenticate(@RequestParam String userName, @RequestParam String password, Model model, HttpServletRequest request) {
		String rawCookie = request.getHeader("Cookie");
		
		
		//Développer la partie accsè à la base de données pour vérifier si l'utilisateur EXISTE 
		//Si l'utilsateur est dans la base de données  alors récupérer  idUser , nom, prenom 
		boolean utilisateurDansLaBaseDeDonnes = true;
		
		if(utilisateurDansLaBaseDeDonnes) {
			List<SessionUser> utilisateursConnectes = (List<SessionUser>) request.getSession().getAttribute("USERS_CONNECTED_SESSION");
			if(utilisateursConnectes!=null) {
				boolean dejaConnecte = false; 
				for(SessionUser user : utilisateursConnectes) {
					if(userName.equals(user.getLogin())) {
						dejaConnecte = true; 
					}
				}
				if(!dejaConnecte) {
					SessionUser user = new SessionUser(1, userName, "nom", "prenom", true, rawCookie);
					utilisateursConnectes.add(user);
				}
				model.addAttribute("authenticate","OK");
			} else {
				SessionUser user = new SessionUser(1, userName, "nom", "prenom", true, rawCookie);
				List<SessionUser> users = new ArrayList<SessionUser>(); 
				users.add(user);
				request.getSession().setAttribute("USERS_CONNECTED_SESSION", users); 
			}
			return true;
		} else {
			//Sinon l'utilisateur n'existe dans la base de données il doit créer son compte
			return false;
		}
	}
	
	
	
	@ResponseBody
	@GetMapping("/verifAuth")
	public Boolean verifAuth( HttpServletRequest request) {
		List<SessionUser> utilisateursConnectes = (List<SessionUser>) request.getSession().getAttribute("USERS_CONNECTED_SESSION");
		String rawCookie = request.getHeader("Cookie");
		if(utilisateursConnectes!=null) {
			for(SessionUser user : utilisateursConnectes) {
				if(rawCookie.equals(user.getCookies())) {
					return true; 
				}
			}
		} 
		return false;
	}
	
}
	
	

