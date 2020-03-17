package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.models.Hopital;

//dans le <> on mets la classe géré et le type de la clé primaire
public interface IHopitalRepository extends JpaRepository<Hopital, Long>{

}
         