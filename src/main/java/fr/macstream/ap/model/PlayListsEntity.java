package fr.macstream.ap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PL")
public class PlayListsEntity {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idPlayList;	
	private Integer user;
	private Integer film;
	
	public PlayListsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public PlayListsEntity(Integer user, Integer film) {
		this.user = user;
		this.film = film;
	}


	public PlayListsEntity(Integer idPlayList, Integer user, Integer film) {
		super();
		this.idPlayList = idPlayList;
		this.user = user;
		this.film = film;
	}

	public Integer getIdPlayList() {
		return idPlayList;
	}

	public void setIdPlayList(Integer idPlayList) {
		this.idPlayList = idPlayList;
	}

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public Integer getFilm() {
		return film;
	}

	public void setFilm(Integer film) {
		this.film = film;
	}

		
}
