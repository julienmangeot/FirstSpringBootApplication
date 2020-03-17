package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.models.Medecin;

public interface IMedecinRepository extends JpaRepository<Medecin, Long>{

}
