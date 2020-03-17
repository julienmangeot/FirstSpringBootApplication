package fr.formation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_patient")
public class Patient {
	
	
	private long idPatient;
	private String nomPatient;
	private String etat;
	private Medecin medecin;

	public Patient() {
	}

	public Patient(String nomPatient, String etat, Medecin medecin) {
		this.nomPatient = nomPatient;
		this.etat = etat;
		this.medecin = medecin;
	}
	
	@Id
	@GeneratedValue
	@Column(name="id_patient")
	public long getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}

	public String getNomPatient() {
		return nomPatient;
	}

	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	@JoinColumn(name="id_medecin")
	@ManyToOne
	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	public String toString() {
		return "Patient [idPatient=" + idPatient + ", nomPatient=" + nomPatient + ", etat=" + etat + ", medecin="
				+ medecin + "]";
	}
	
	
	

}
