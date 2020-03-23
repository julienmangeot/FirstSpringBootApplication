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


import fr.formation.models.Medecin;
import fr.formation.service.IMedecinService;

@RestController
@RequestMapping("medecin")
@CrossOrigin("http://localhost:4200")
public class MedecinController {

	@Autowired
	IMedecinService medecinService;
	
	
	@GetMapping("/all")
	public List<Medecin> getAllM(){
		return medecinService.getAllMedecin();
	}
	
	@GetMapping("/{id}")
	public Medecin getOneM(@PathVariable long id) {
		return medecinService.getMedecinById(id);
	}
	
	@PostMapping
	public boolean createM(@RequestBody Medecin medecin) {
		return medecinService.createMedecin(medecin);
	}
	
	@PutMapping("/{id}")
	public boolean updateM(@PathVariable long id, @RequestBody Medecin medecin) {
		Medecin m1=medecinService.getMedecinById(id);
		m1.setNomMedecin(medecin.getNomMedecin());
		m1.setNbPatients(medecin.getNbPatients());
		medecinService.createMedecin(m1);
		return true;
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteM(@PathVariable long id) {
		return medecinService.deleteMedecin(id);
	}
	
	@PutMapping("/set/{idM}/{idH}")
	public Medecin affecteMedecin(@PathVariable long idM, @PathVariable long idH) {
		return medecinService.affectationMedecin(idM, idH);
	}
	
	
}
