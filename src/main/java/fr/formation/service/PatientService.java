package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.models.Medecin;
import fr.formation.models.Patient;
import fr.formation.repository.IMedecinRepository;
import fr.formation.repository.IPatientRepository;

@Service
public class PatientService implements IPatientService{
	
	@Autowired
	IPatientRepository patientRepository;
	
	@Autowired
	IMedecinRepository medecinRepository;

	public boolean createPatient(Patient patient) {
		patientRepository.save(patient);
		return true;
	}

	public boolean deletePatient(long idPatient) {
		try {
		patientRepository.deleteById(idPatient);
		return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<Patient> getAllPatient() {
		return patientRepository.findAll();
	}

	public Patient getPatientById(long idPatient) {
		Optional<Patient> oPatient = patientRepository.findById(idPatient);
		Patient patient = new Patient();
		if(oPatient.isPresent()) {
			patient=oPatient.get();
		}
		return patient;
	}
	
	public Patient affectationPatient(long idPatient, long idMedecin) {
		Optional<Patient> oPatient = patientRepository.findById(idPatient);
		Patient patient = new Patient();
		Optional<Medecin> oMedecin = medecinRepository.findById(idMedecin);
		Medecin medecin = new Medecin();
		if(oPatient.isPresent() && oMedecin.isPresent()) {
			patient=oPatient.get();
			medecin=oMedecin.get();
			patient.setMedecin(medecin);
			patientRepository.save(patient);
		}
		return patient;
	}
}
