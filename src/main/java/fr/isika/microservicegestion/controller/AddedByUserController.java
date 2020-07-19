package fr.isika.microservicegestion.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.isika.microservicegestion.model.AddedByUser;
import fr.isika.microservicegestion.repository.AddedByUserRepository;

@CrossOrigin("*")
@RestController
@RequestMapping(path="/addedByUser")
public class AddedByUserController {

	@Autowired
	private AddedByUserRepository addedByUserRepository;
	
	@RequestMapping(value ="/ajouterEvent",method=RequestMethod.POST)
	public AddedByUser saveEvent(@RequestBody AddedByUser addedByUser) {
		return addedByUserRepository.save(addedByUser);
	}	
	
	@RequestMapping(value="/findAllSaved")
	public Iterable<AddedByUser> findAll(){
		return addedByUserRepository.findAll();
	}
	
	@GetMapping(path="/findAllByUser/{username}")
	public List <AddedByUser> findByUsername(@PathVariable String username){
		return addedByUserRepository.findByUsername(username);
	}
	@GetMapping(path="/findAllByEvent/{event}")
	public AddedByUser findByEvent(@PathVariable String event){
		return addedByUserRepository.findByEvent(event);
	}
	
	@DeleteMapping(path="/DeleteUserEvent/{event}")
	public void deleteByEvent(@PathVariable String event){
		AddedByUser aBU = new AddedByUser();
		aBU= findByEvent(event);
		Long aBUId= aBU.getId();
		addedByUserRepository.deleteById(aBUId);
	}

}
