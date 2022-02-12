package fr.macstream.ap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.macstream.ap.model.User;

/**
 * 
 * @author ElMoNkoBo
 *
 */


public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByLogin(String login);
	
	public User findByNom(String nom);

	public User findByMotdepasse(String motdepasse);
}
