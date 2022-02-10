package fr.macstream.ap.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name = "Films")
public class MovieEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idFilm;	
	private String imagePath;
	private String langueOriginal;
	private String titreOriginal;
	@Column(columnDefinition="TEXT")
	private String resume ;
	private Float popularite;
	private String  posterPath;
	private String  anneeRealisation;
	private String titre;
	private boolean video;
	private Float moyenneVotes;
	private Float decompteVote;
	private int idGenre;
	private String type;

	@ManyToMany(mappedBy="playlist", fetch=FetchType.LAZY)
	private Set<User> users = new HashSet<>();
	
	public MovieEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MovieEntity(Integer idFilm, String imagePath, String langueOriginal, String titreOriginal, String resume,
			Float popularite, String posterPath, String anneeRealisation, String titre, boolean video,
			Float moyenneVotes, Float decompteVote, int idGenre, String type) {
		super();
		this.idFilm = idFilm;
		this.imagePath = imagePath;
		this.langueOriginal = langueOriginal;
		this.titreOriginal = titreOriginal;
		this.resume = resume;
		this.popularite = popularite;
		this.posterPath = posterPath;
		this.anneeRealisation = anneeRealisation;
		this.titre = titre;
		this.video = video;
		this.moyenneVotes = moyenneVotes;
		this.decompteVote = decompteVote;
		this.idGenre = idGenre;
		this.type = type;
	}

	public Integer getIdFilm() {
		return idFilm;
	}
	public void setIdFilm(Integer idFilm) {
		this.idFilm = idFilm;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getLangueOriginal() {
		return langueOriginal;
	}

	public void setLangueOriginal(String langueOriginal) {
		this.langueOriginal = langueOriginal;
	}

	public String getTitreOriginal() {
		return titreOriginal;
	}
	public void setTitreOriginal(String titreOriginal) {
		this.titreOriginal = titreOriginal;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public Float getPopularite() {
		return popularite;
	}
	public void setPopularite(Float popularite) {
		this.popularite = popularite;
	}
	public String getPosterPath() {
		return posterPath;
	}
	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}
	public String getAnneeRealisation() {
		return anneeRealisation;
	}
	public void setAnneeRealisation(String anneeRealisation) {
		this.anneeRealisation = anneeRealisation;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public boolean isVideo() {
		return video;
	}
	public void setVideo(boolean video) {
		this.video = video;
	}
	public Float getMoyenneVotes() {
		return moyenneVotes;
	}
	public void setMoyenneVotes(Float moyenneVotes) {
		this.moyenneVotes = moyenneVotes;
	}
	public Float getDecompteVote() {
		return decompteVote;
	}
	public void setDecompteVote(Float decompteVote) {
		this.decompteVote = decompteVote;
	}



	public int getIdGenre() {
		return idGenre;
	}

	public void setIdGenre(int idGenre) {
		this.idGenre = idGenre;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

