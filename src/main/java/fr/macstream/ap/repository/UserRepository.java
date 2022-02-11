package fr.macstream.ap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.macstream.ap.model.User;

/**
 * 
 * @author ElMoNkoBo
 *
 */


public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByLogin(String login);
	
}
