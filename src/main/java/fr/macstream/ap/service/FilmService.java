package fr.macstream.ap.service;
/**
 * Ce Service (ou spring Bean) expose les méthodes de gestion des MovieEntity et des GenresEntity
 * Il consomme les deux interfaces JpaRepository MovieRepository et GenreRepository 
 * @author ElMoNkoBo
 * @version 2022-02-11
 *
 */

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.macstream.ap.model.GenresEntity;
import fr.macstream.ap.model.MovieEntity;
import fr.macstream.ap.repository.GenreRepository;
import fr.macstream.ap.repository.MovieRepository;
/**
 * Service de gestion des MovieEntity et GenresEntity
 * Ce service consomme les interfaces MovieRepository et GenresRepository
 * @author ElMoNkoBo (Farid, Meriama, Charles, Stéphane)
 * @version 2022-02-11
 */
@Service
public class FilmService {
	
	@Autowired
	private MovieRepository movieRepository;
	@Autowired
	private GenreRepository genreRepository;

	public FilmService() {}
	
	/***
	 * Cette méthode permet de rechercher un MovieEntity par son titre
	 * @param titre Le titre du MovieEntity à rechercher
	 * @return un MovieEntity ou null 
	 */
	public MovieEntity rechercheParTitre(String titre) {
		return this.movieRepository.findByTitre(titre);
	}
	
	/***
	 * Cette méthode permet de rechercher tous les MovieEntity correspondants à l'identifiant du genre passé en paramètre
	 * @param idGenre l'identifiant du genre 
	 * @return une liste de MovieEntity ou null si aucun MovieEntity ne correspond
	 */
	public List<MovieEntity> rechercherFilmGenre(int idGenre){
		if(this.genreRepository.findAll() != null) {
			return this.movieRepository.findByIdGenre(idGenre); 
		}
		return null;
	}
	
	/**
	 * Cette fonction permet de récupérer un MovieEntity selon l'identifiant
	 * passé en paramètre
	 * @param idFilm Identifiant du MovieEntity à rechercher
	 * @return un MovieEntity ou null si absent de la base de données
	 */
	public MovieEntity rechercheParId(int idFilm) {
		return this.movieRepository.getById(idFilm);
	}
	
	/**
	 * Cette fonction permet de récupérer tous les films actuellement en base de données
	 * @return La liste de tous les films ou null
	 */
	public List<MovieEntity> listerFilms(){
		return this.movieRepository.findAll();
	}
	
	/**
	 * Cette méthode permet de lister les MovieEntity ayant l'attribut Type = 'Populaires'
	 * Soit la liste des MovieEntity les plus populaires
	 * @return Une liste de MovieEntity ou null
	 */
	public List<MovieEntity> listerFilmsPopulaires(){
		return this.movieRepository.findByType("Populaires");
	}
	
	/**
	 * Cette fonction permet de ne récupérer que la liste des genres correspondants
	 * 	aux films présents dans la base de données locale.
	 * @return Une liste de GenresEntity pour lequel il existe au moins un MovieEntity.
	 *  
	 */
	public List<GenresEntity> listerGenres(){
		List<MovieEntity> moviesList = this.listerFilms();
		List<Integer> genresKeys = new ArrayList<>();
		for(MovieEntity movieEntity : moviesList)
			genresKeys.add(movieEntity.getIdGenre());
		return this.genreRepository.findAllById(genresKeys);
	}
}
