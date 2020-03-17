package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.models.Hopital;
import fr.formation.repository.IHopitalRepository;

@Service
public class HopitalService implements IHopitalService{
	
	@Autowired
	IHopitalRepository hopitalRepository;

	public boolean createHopital(Hopital hopital) {
		hopitalRepository.save(hopital);
		return true;
	}

	public boolean deleteHopital(long idHopital) {
		try {
		hopitalRepository.deleteById(idHopital);
		return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
 
	public List<Hopital> getAllHopital() {
		return hopitalRepository.findAll();
	}
	
	public Hopital getHopitalById(long idHopital) {
		Optional<Hopital> oHopital=hopitalRepository.findById(idHopital);
		Hopital hopital = new Hopital();
		if(oHopital.isPresent()) {
			hopital=oHopital.get();
		}
		return hopital;
	}

}
