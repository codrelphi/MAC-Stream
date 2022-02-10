package fr.macstream.ap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.macstream.ap.model.MovieEntity;


public interface MovieRepository  extends JpaRepository<MovieEntity, Integer>{

}

