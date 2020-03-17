package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.models.Patient;

public interface IPatientRepository extends JpaRepository<Patient, Long>{

}
