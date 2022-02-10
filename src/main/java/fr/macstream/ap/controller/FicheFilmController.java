package fr.macstream.ap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import fr.macstream.ap.model.MovieEntity;
import fr.macstream.ap.repository.MovieRepository;


@Controller
public class FicheFilmController {

	@Autowired
	MovieRepository  movieRepository;

	@GetMapping("/film/{idFilm}")
	public String getMovie(@PathVariable int idFilm, Model model) {

		MovieEntity filmFiche = movieRepository.getById(idFilm);

		model.addAttribute("film" , filmFiche);

		return "movies";
	}


}