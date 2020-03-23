package fr.formation.service;

import java.util.List;
import java.util.Optional;

import fr.formation.models.Patient;

public interface IPatientService {
	
	public boolean createPatient(Patient patient);
	
	public boolean deletePatient(long idPatient);
	
	public List<Patient> getAllPatient();

	public Patient getPatientById(long idPatient);
	
	public Patient affectationPatient(long idPatient, long idMedecin);
}
