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

import fr.formation.models.Patient;
import fr.formation.service.IPatientService;

@RestController
@RequestMapping("patient")
@CrossOrigin("http://localhost:4200")
public class PatientController {
	
	@Autowired
	IPatientService patientService;
	
	@GetMapping("/all")
	public List<Patient> getAllP(){
		return patientService.getAllPatient();	
	}
	
	@GetMapping("/{id}")
	public Patient getOneP(@PathVariable long id) {
		return patientService.getPatientById(id);
	}
	
	@PostMapping()
	public boolean createP(@RequestBody Patient patient) {
		return patientService.createPatient(patient);
	}
	
	@PutMapping("/{id}")
	public boolean updateP(@PathVariable long id, @RequestBody Patient patient) {
		Patient p1=patientService.getPatientById(id);
		p1.setNomPatient(patient.getNomPatient());
		p1.setEtat(patient.getEtat());
		patientService.createPatient(p1);
		return true;
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteP(@PathVariable long id) {
		return patientService.deletePatient(id);
	}
	
	@PutMapping("/set/{idP}/{idM}")
	public Patient affectePatient(@PathVariable long idP, @PathVariable long idM) {
		return patientService.affectationPatient(idP, idM);
	}

}
