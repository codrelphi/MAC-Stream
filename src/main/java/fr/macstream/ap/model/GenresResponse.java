package fr.macstream.ap.model;

import java.util.List;


public class GenresResponse {

	 private List<Genres> genres;

	public GenresResponse(List<Genres> genres) {
		super();
		this.genres = genres;
	}

	public GenresResponse() {
		super();
	}

	public List<Genres> getGenres() {
		return genres;
	}

	public void setGenres(List<Genres> genres) {
		this.genres = genres;
	}
}	 