package fr.macstream.ap.controller;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import fr.macstream.ap.clienthttp.HttpService;
import fr.macstream.ap.model.Genres;
import fr.macstream.ap.model.GenresEntity;
import fr.macstream.ap.model.GenresResponse;
import fr.macstream.ap.model.Movie;
import fr.macstream.ap.model.MovieEntity;
import fr.macstream.ap.model.MovieResponse;
import fr.macstream.ap.repository.GenreRepository;
import fr.macstream.ap.repository.MovieRepository;

@Controller
public class AdminController {

	private static List<Movie> movies= new ArrayList<>();
	private static List<Genres> genres= new ArrayList<>();

	@Autowired
	MovieRepository  movieRepository;

	@Autowired
	GenreRepository  genreRepository;

	@Autowired
	HttpService httpService;



	private MovieEntity getMovieEntity(Movie movie, String type) {
		int genre = 0;
		if(movie.getGenre_ids()!=null && movie.getGenre_ids().size()>0) {
			genre = movie.getGenre_ids().get(0);
		}
		MovieEntity movieForDb = new MovieEntity(
				movie.getId(), 
				movie.getBackdrop_path(), 
				movie.getOriginal_language(), 
				movie.getOriginal_title(), 
				movie.getOverview(), 
				movie.getPopularity(),
				movie.getPoster_path(),
				movie.getRelease_date(),
				movie.getTitle(),
				movie.isVideo(), 
				movie.getVote_average(),
				movie.getVote_count(),
				genre,
				type);


		return movieForDb;
	}

	private GenresEntity getGenreEntity(Genres genre) {
		GenresEntity genreForDb = new GenresEntity(genre.getId(), genre.getName());
		return genreForDb; 
	}


	@GetMapping("/movies")
	public String listeDesFilms(Model model) {
		List<Movie> moviesPopular = new ArrayList<>();
		List<Movie> moviesUpComing = new ArrayList<>();
		List<Movie> moviesNowPlaying = new ArrayList<>();
		List<Movie> moviesTopRate = new ArrayList<>();
		try { 
			ResponseEntity<MovieResponse> filmsResponse = httpService.getMovies();
			if(filmsResponse!=null && filmsResponse.getBody()!=null && filmsResponse.getBody().getResults()!=null) {
				movies = filmsResponse.getBody().getResults();
				moviesPopular = filmsResponse.getBody().getResults();
			}

			for(Movie m:moviesPopular) {
				movieRepository.save(getMovieEntity(m, "Populaires"));
			}

			ResponseEntity<MovieResponse> filmsUpComingResponse = httpService.getMoviesUpComing();
			if(filmsUpComingResponse!=null && filmsUpComingResponse.getBody()!=null && filmsUpComingResponse.getBody().getResults()!=null) {
				movies.addAll(filmsUpComingResponse.getBody().getResults());
				moviesUpComing = filmsUpComingResponse.getBody().getResults();
			}

			for(Movie m:moviesUpComing) {
				movieRepository.save(getMovieEntity(m, "A venir"));

			}

			ResponseEntity<MovieResponse> filmsNowPlayingResponse = httpService.getMoviesNowPlaying();
			if(filmsNowPlayingResponse!=null && filmsNowPlayingResponse.getBody()!=null && filmsNowPlayingResponse.getBody().getResults()!=null) {
				movies.addAll(filmsNowPlayingResponse.getBody().getResults());
				moviesNowPlaying = filmsNowPlayingResponse.getBody().getResults();
			}

			for(Movie m : moviesNowPlaying) {
				movieRepository.save(getMovieEntity( m , "En salle"));
			}

			ResponseEntity<MovieResponse> filmsTopRatedResponse = httpService.getMoviesTopRated();
			if(filmsTopRatedResponse!=null && filmsNowPlayingResponse.getBody()!=null && filmsTopRatedResponse.getBody().getResults()!=null) {
				movies.addAll(filmsTopRatedResponse.getBody().getResults());
				moviesTopRate = filmsTopRatedResponse.getBody().getResults();
			}

			for(Movie m : moviesTopRate) {
				movieRepository.save(getMovieEntity( m , "Mieux notes"));
			}

			model.addAttribute("movies", movies);

		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "accueil";
	}

	@GetMapping("/genres")
	public String listeDesGenre(Model model) {

		try {
			ResponseEntity<GenresResponse> genresResponse = httpService.getGenres();
			if(genresResponse!=null && genresResponse.getBody()!=null && genresResponse.getBody().getGenres()!=null) {
				genres = genresResponse.getBody().getGenres();
				for(Genres g: genres) {
					genreRepository.save(getGenreEntity(g));
				}
				model.addAttribute("genres", genres);
			}
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "ficheFilms";
	}


}
