package fr.formation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.formation.models.Hopital;
import fr.formation.models.Medecin;
import fr.formation.models.Patient;
import fr.formation.service.IHopitalService;
import fr.formation.service.IMedecinService;
import fr.formation.service.IPatientService;

@SpringBootApplication
public class FirstSpringBootApplication  implements CommandLineRunner{
	
	@Autowired
	IHopitalService hopitalService;
	@Autowired
	IMedecinService medecinService;
	@Autowired
	IPatientService patientService;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}

	//C'est pour capturer lors du run toutes les exceptions
	public void run(String... args) throws Exception {
		
//		hopitalService.createHopital(new Hopital("Toulouse Hospital", 1, 1));
//		hopitalService.deleteHopital(16);
		
//		Medecin m1 = new Medecin();
//		m1.setNomMedecin("Granger");
//		m1.setNbPatients(24);
//		Hopital h1 = new Hopital();
//		h1.setIdHopital(12);
//		m1.setHopital(h1);
//		medecinService.createMedecin(m1);
		
//		Patient p1= new Patient();
//		p1.setNomPatient("Chasseloup");
//		p1.setEtat("soigné");
//		Medecin m2= new Medecin();
//		m2=	medecinService.getMedecinById(13);
//		p1.setMedecin(m2);
//		patientService.createPatient(p1);
		
//		System.err.println(hopitalService.getHopitalById(1));
//		System.err.println(medecinService.getMedecinById(13));
//		System.err.println(patientService.getPatientById(15));
		
//		System.err.println(patientService.getAllPatient());
//		System.err.println(hopitalService.getAllHopital());
	}

}
