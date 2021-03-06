package fr.formation.service;

import java.util.List;

import fr.formation.models.Medecin;


public interface IMedecinService {
	
	public boolean createMedecin(Medecin medecin);
	
	public boolean deleteMedecin(long idMedecin);
	
	public List<Medecin> getAllMedecin();
	
	public Medecin getMedecinById(long idMedecin);
	
	public Medecin affectationMedecin(long idMedecin, long idHopital);
	
}
