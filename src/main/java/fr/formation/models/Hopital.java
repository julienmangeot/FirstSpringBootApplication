package fr.formation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_hopital")
public class Hopital {
	
	
	private long idHopital;
	private String nomHopital;
	private long nbMedecins;
	private long places;
	
	public Hopital() {
	}

	public Hopital(String nomHopital, long nbMedecins, long places) {
		this.nomHopital = nomHopital;
		this.nbMedecins = nbMedecins;
		this.places = places;
	}
	
	@Id
	@GeneratedValue
	@Column(name="id_hopital")
	public long getIdHopital() {
		return idHopital;
	}

	public void setIdHopital(long idHopital) {
		this.idHopital = idHopital;
	}

	public String getNomHopital() {
		return nomHopital;
	}

	public void setNomHopital(String nomHopital) {
		this.nomHopital = nomHopital;
	}

	public long getNbMedecins() {
		return nbMedecins;
	}

	public void setNbMedecins(long nbMedecins) {
		this.nbMedecins = nbMedecins;
	}

	public long getPlaces() {
		return places;
	}

	public void setPlaces(long places) {
		this.places = places;
	}

	public String toString() {
		return "Hopital [idHopital=" + idHopital + ", nomHopital=" + nomHopital + ", nbMedecins=" + nbMedecins
				+ ", places=" + places + "]";
	}
	
	
	

}
