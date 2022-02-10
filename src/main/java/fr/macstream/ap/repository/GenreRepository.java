package fr.macstream.ap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.macstream.ap.model.GenresEntity;


public interface GenreRepository  extends JpaRepository<GenresEntity, Integer> {

}