package fr.formation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_medecin")
public class Medecin {
	

	private long idMedecin;
	private String nomMedecin;
	private long nbPatients;
	private Hopital hopital;

	public Medecin() {
	}

	public Medecin(String nomMedecin, long nbPatients, Hopital hopital) {
		this.nomMedecin = nomMedecin;
		this.nbPatients = nbPatients;
		this.hopital = hopital;
	}

	@Id
	@GeneratedValue
	@Column(name="id_medecin")
	public long getIdMedecin() {
		return idMedecin;
	}

	public void setIdMedecin(int idMedecin) {
		this.idMedecin = idMedecin;
	}

	public String getNomMedecin() {
		return nomMedecin;
	}

	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}

	public long getNbPatients() {
		return nbPatients;
	}

	public void setNbPatients(long nbPatients) {
		this.nbPatients = nbPatients;
	}

	@JoinColumn(name="id_hopital")
	@ManyToOne
	public Hopital getHopital() {
		return hopital;
	}

	public void setHopital(Hopital hopital) {
		this.hopital = hopital;
	}

	public String toString() {
		return "Medecin [idMedecin=" + idMedecin + ", nomMedecin=" + nomMedecin + ", nbPatients=" + nbPatients
				+ ", hopital=" + hopital + "]";
	}


}
