package fr.macstream.ap.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.macstream.ap.model.MovieEntity;


public interface MovieRepository  extends JpaRepository<MovieEntity, Integer>{

	public MovieEntity findByTitre(String titre);
	
	public List<MovieEntity> findByIdGenre(int idgenre);
	
	public List<MovieEntity> findByType(String type);
}

