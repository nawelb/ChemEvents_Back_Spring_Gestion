package fr.isika.microservicegestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.isika.microservicegestion.model.Favoris;
import fr.isika.microservicegestion.repository.FavorisRepository;

@CrossOrigin("*")
@RestController
@RequestMapping(path="/favoris")
public class FavorisController {

	@Autowired
	private FavorisRepository favorisRepository;
	
	@RequestMapping(value ="/newFavoris",method=RequestMethod.POST)
	public Favoris saveEvent(@RequestBody Favoris favoris) {
		return favorisRepository.save(favoris);
	}	
	
	
	@GetMapping(path="/listeFavoris/{username}")
	public List <Favoris> findByUsername(@PathVariable String username){
		return favorisRepository.findByUsername(username);
	}
	@GetMapping(path="/listeFavorisEvent/{event}")
	public Favoris findByEvent(@PathVariable String event){
		return favorisRepository.findByEvent(event);
	}
	
	@DeleteMapping(path="/listeFavoris/{username}/{event}")
	public void deleteByEvent(@PathVariable String event, @PathVariable String username){
		List <Favoris> myFavoris= findByUsername(username);
		Favoris favorisToDelete= new Favoris();
		for (Favoris favoris : myFavoris) {
			favoris = findByEvent(event);
			favorisToDelete=favoris;
		}
		Long favorisId= favorisToDelete.getId();
		favorisRepository.deleteById(favorisId);
	}
	
	
}
