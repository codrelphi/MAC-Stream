package fr.macstream.ap.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Genres")
public class GenresEntity {

	@Id 
	private Integer idGenre;	
	private String genre;
	public GenresEntity(Integer idGenre, String genre) {
		super();
		this.idGenre = idGenre;
		this.genre = genre;
	}
	public GenresEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getIdGenre() {
		return idGenre;
	}
	public void setIdGenre(Integer idGenre) {
		this.idGenre = idGenre;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
}

