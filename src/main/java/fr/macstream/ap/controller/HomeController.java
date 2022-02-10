package fr.macstream.ap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.macstream.ap.model.Genre;
import fr.macstream.ap.repository.FilmRepository;
import fr.macstream.ap.repository.GenreRepository;

@Controller
public class HomeController {
	@Autowired
	GenreRepository genreRepository;
	
	@GetMapping("/home") 
	public String helloWorld(Model model) {
		List<Film> films = FilmRepository.findAll();
		List<Genre> genres = GenreRepository.findAll();

		model.addAllAttributes("films",films);
		model.addAllAttributes("genres",genres);

	 return "accueil";
	 }

}
