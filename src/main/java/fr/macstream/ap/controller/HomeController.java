package fr.macstream.ap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.macstream.ap.service.FilmService;



@Controller
public class HomeController {
	@Autowired
	private FilmService filmService;
	
	@GetMapping({"/","/home","/accueil"}) 
	public String helloWorld(Model model) {
		model.addAttribute("films",this.filmService.listerFilmsPopulaires());
		model.addAttribute("genres",this.filmService.listerGenres());
		return "accueil";
	 }

}
