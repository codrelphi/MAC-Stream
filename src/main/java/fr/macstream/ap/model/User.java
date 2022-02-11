package fr.macstream.ap.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.persistence.GenerationType;

/**
 * 
 * @author ElMoNkoBo (Farid, Meriama, Charles, Stéphane
 *
 */

@Entity(name="Users")
public class User{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUser;
	
	private String login;
	private String motdepasse;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="Playlists",
	joinColumns= {@JoinColumn(name="idUser")},
	inverseJoinColumns= {@JoinColumn(name="idFilm")})
	private Set<MovieEntity> playlist = new HashSet<>();
	
	public Set<MovieEntity> getPlaylist() {
		return playlist;
	}


	public void setPlaylist(Set<MovieEntity> playlist) {
		this.playlist = playlist;
	}


	public User() {
		super();
	}
	
	
	public User(String login, String motdepasse) {
		this.login = login;
		this.motdepasse = motdepasse;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotdepasse() {
		return motdepasse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}
	
	
}
