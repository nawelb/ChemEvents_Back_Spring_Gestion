package fr.isika.microservicegestion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.isika.microservicegestion.model.Favoris;


public interface FavorisRepository extends JpaRepository<Favoris, Long> {

	List<Favoris> findByUsername(String username);

	Favoris findByEvent(String event);

}
