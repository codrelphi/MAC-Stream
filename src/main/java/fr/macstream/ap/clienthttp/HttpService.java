package fr.macstream.ap.clienthttp;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import fr.macstream.ap.model.GenresResponse;
import fr.macstream.ap.model.MovieResponse;


@Service
public class HttpService {

	RestTemplate restTemplate = new RestTemplate();
	public HttpService() {
		// TODO Auto-generated constructor stub
	}

	public ResponseEntity<MovieResponse> getMovies() throws URISyntaxException {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
		String url = "https://api.themoviedb.org/3/movie/popular?api_key=88c2fadc3b708a9aac62e0d8cb8a1db0&language=fr";
		URI uri = new URI(url);

		ResponseEntity<MovieResponse> response = restTemplate
				.exchange(uri, HttpMethod.GET, null, MovieResponse.class);

		return response;
	}

	public ResponseEntity<MovieResponse> getMoviesUpComing() throws URISyntaxException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON_UTF8);

		String urlAVenir = "https://api.themoviedb.org/3/movie/upcoming?api_key=88c2fadc3b708a9aac62e0d8cb8a1db0&language=fr&page=1&language=fr";
		URI uriAVenir = new URI(urlAVenir);

		ResponseEntity<MovieResponse> response = restTemplate
				.exchange(uriAVenir, HttpMethod.GET, null, MovieResponse.class);
		return response;
	}

	public ResponseEntity<MovieResponse> getMoviesNowPlaying() throws URISyntaxException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON_UTF8);

		String urlEnSalle = "https://api.themoviedb.org/3/movie/now_playing?api_key=88c2fadc3b708a9aac62e0d8cb8a1db0&language=fr&page=1";
		URI uriEnSaller = new URI(urlEnSalle);

		ResponseEntity<MovieResponse> response = restTemplate
				.exchange(uriEnSaller, HttpMethod.GET, null, MovieResponse.class);
		return response;
	}

	public ResponseEntity<MovieResponse> getMoviesTopRated() throws URISyntaxException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON_UTF8);

		String urlMieuxNotes = "https://api.themoviedb.org/3/movie/top_rated?api_key=88c2fadc3b708a9aac62e0d8cb8a1db0&language=fr&page=1";
		URI uriMieuxNotes = new URI(urlMieuxNotes);

		ResponseEntity<MovieResponse> response = restTemplate
				.exchange(uriMieuxNotes, HttpMethod.GET, null, MovieResponse.class);
		return response;
	}



	public ResponseEntity<GenresResponse> getGenres() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
		String url = "https://api.themoviedb.org/3/genre/movie/list?api_key=88c2fadc3b708a9aac62e0d8cb8a1db0&language=fr";
		URI uri = new URI(url);
		ResponseEntity<GenresResponse> response = restTemplate
				.exchange(uri, HttpMethod.GET, null, GenresResponse.class);
		return response;
	}
}

