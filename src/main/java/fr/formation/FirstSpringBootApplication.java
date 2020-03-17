package fr.formation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.formation.service.IHopitalService;

@SpringBootApplication
public class FirstSpringBootApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}

	//C'est pour capturer lors du run toutes les exceptions
	public void run(String... args) throws Exception {
		
		IHopitalService hopitalService;
		
	}

}
