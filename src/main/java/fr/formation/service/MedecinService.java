package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.models.Medecin;
import fr.formation.repository.IMedecinRepository;

@Service
public class MedecinService implements IMedecinService{
	
	@Autowired
	IMedecinRepository medecinRepository;

	public boolean createMedecin(Medecin medecin) {
		medecinRepository.save(medecin);
		return true;
	}

	public boolean deleteMedecin(long idMedecin) {
		try {
			medecinRepository.deleteById(idMedecin);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	public List<Medecin> getAllMedecin() {
		return medecinRepository.findAll();
	}

	public Medecin getMedecinById(long idMedecin) {
		Optional<Medecin> oMedecin = medecinRepository.findById(idMedecin);
		Medecin medecin = new Medecin();
		if(oMedecin.isPresent()) {
			medecin= oMedecin.get();
		}
		return medecin;
	}
	
	

}
