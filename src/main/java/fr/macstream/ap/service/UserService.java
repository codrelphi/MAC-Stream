package fr.macstream.ap.service;
/**
 * Service (spring boot Bean) de gestion de l'entité User
 * Ce service consomme l'interface UserRepository
 * @author ElMoNkoBo (Farid, Meriama, Charles, Stéphane
 *
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.macstream.ap.model.User;
import fr.macstream.ap.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private FilmService filmService;
	
	public UserService() {
		
	}
	

	public User connexion(String login, String motdepasse) {
		User connectedUser = null;
		if(this.authentification(login, motdepasse)) {
			connectedUser = this.userRepository.findByLogin(login);
		}
		return connectedUser;
	}
	
	/**
	 * 
	 * @param login
	 * @param motdepasse
	 * @return
	 */
	public boolean authentification(String login, String motdepasse) {
		boolean estAuthentifie = false;
		User userToFind = this.userRepository.findByLogin(login);
		if(userToFind != null) {
			if(userToFind.getMotdepasse().equals(motdepasse)) {
				estAuthentifie = true;
			}
		}
		return estAuthentifie;
	}

	/**
	 * 
	 * @param login_ou_nom
	 * @return
	 */
	public boolean isUserExists(String login_ou_nom) {
		return (this.userRepository.findByLogin(login_ou_nom) != null || 
				this.userRepository.findByNom(login_ou_nom) != null);
	}
	
	/**
	 * 
	 * @param login
	 * @param nom
	 * @param motdepasse
	 * @param seSouvenirdeMoi
	 * @return
	 */
	public boolean inscription(String login, String nom, String motdepasse, boolean seSouvenirdeMoi) {
		boolean estInscrit = false;
		if(!this.isUserExists(login) && !this.isUserExists(nom)) {
			User nouvelInscrit = new User(login,motdepasse);
			nouvelInscrit.setNom(nom);
			estInscrit = true;
		}
		return estInscrit;
	}
	
	/***
	 * 
	 * @param idUser
	 * @param idFilm
	 * @return
	 */
	public User ajouterFilmPlaylist(User user, int idFilm) {
		user.getPlaylist().add(this.filmService.rechercheParId(idFilm));
		return this.userRepository.save(user);
	}
	
	/**
	 * 
	 * @param user
	 * @param idFilm
	 * @return
	 */
	public User retirerFilmPlaylist(User user, int idFilm) {
		user.getPlaylist().remove(this.filmService.rechercheParId(idFilm));
		return this.userRepository.save(user);
	}
	
}
