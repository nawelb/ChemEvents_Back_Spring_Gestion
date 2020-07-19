package fr.isika.microservicegestion.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.isika.microservicegestion.model.AddedByUser;


@Repository
public interface AddedByUserRepository extends JpaRepository<AddedByUser, Long> {

	List <AddedByUser> findByUsername(String username);

	AddedByUser findByEvent(String event);

	void deleteByEvent(String event);

	
}