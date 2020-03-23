package fr.formation.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.models.Hopital;
import fr.formation.service.IHopitalService;

@RestController
@RequestMapping("hopital")//pour url du webservice, chemin vers cette classe controller
@CrossOrigin("http://localhost:4200") //Autoriser les requetes a partir du 4200
public class HopitalController {

	@Autowired
	IHopitalService hopitalService;
	
	@GetMapping("/all")
	public List<Hopital> getAll(){
		return hopitalService.getAllHopital();
	}
	
	@GetMapping("/{id}")
	public Hopital getOneH(@PathVariable long id) { //on peut avoir plusieurs @PathVariable
		return hopitalService.getHopitalById(id);
	}
	
	@PostMapping
	 public Hopital createH(@RequestBody Hopital hopital){ // On ne peut avoir plusieurs @RequestBody
		return hopitalService.createHopital(hopital);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteH(@PathVariable long id) {
		return hopitalService.deleteHopital(id);
	}
	
	@PutMapping
	 public Hopital updateH(@RequestBody Hopital hopital){ 
		return hopitalService.createHopital(hopital);
	}
	
	@PutMapping("/{idH}")
	public Hopital updateHopital(@PathVariable long idH, @RequestBody Hopital hopital){ 
		Hopital h1= hopitalService.getHopitalById(idH);
		h1.setNomHopital(hopital.getNomHopital());
		h1.setNbMedecins(hopital.getNbMedecins());
		h1.setPlaces(hopital.getPlaces());
		return hopitalService.createHopital(h1);
	}
	
}
