package fr.formation.service;

import java.util.List;
import java.util.Optional;

import fr.formation.models.Hopital;

public interface IHopitalService {
	
	public Hopital createHopital(Hopital hopital);
	
	public boolean deleteHopital(long idHopital);
	
	public List<Hopital> getAllHopital();
	
	public Hopital getHopitalById(long idHopital);
}
