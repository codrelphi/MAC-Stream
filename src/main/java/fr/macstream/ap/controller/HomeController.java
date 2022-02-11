package fr.macstream.ap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.macstream.ap.model.GenresEntity;
import fr.macstream.ap.model.MovieEntity;
import fr.macstream.ap.repository.MovieRepository;
import fr.macstream.ap.repository.GenreRepository;

@Controller
public class HomeController {
	@Autowired
	GenreRepository genreRepository;
	@Autowired
	MovieRepository movieRepository;
	
	
	@GetMapping("/home") 
	public String helloWorld(Model model) {
		List<MovieEntity> films = movieRepository.findAll();
		List<GenresEntity> genres = genreRepository.findAll();
		model.addAttribute("films",films);
		model.addAttribute("genres",genres);
		
	 return "accueil";
	 }

}
