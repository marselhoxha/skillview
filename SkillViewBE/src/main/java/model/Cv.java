package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cv database table.
 * 
 */
@Entity
@NamedQuery(name="Cv.findAll", query="SELECT c FROM Cv c")
public class Cv implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	//bi-directional many-to-one association to AnagraficaDipendenti
	@ManyToOne
	@JoinColumn(name="id_dipendente")
	private AnagraficaDipendenti anagraficaDipendenti;

	//bi-directional many-to-one association to Competenze
	@ManyToOne
	@JoinColumn(name="id_competenza")
	private Competenze competenze;

	public Cv() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AnagraficaDipendenti getAnagraficaDipendenti() {
		return this.anagraficaDipendenti;
	}

	public void setAnagraficaDipendenti(AnagraficaDipendenti anagraficaDipendenti) {
		this.anagraficaDipendenti = anagraficaDipendenti;
	}

	public Competenze getCompetenze() {
		return this.competenze;
	}

	public void setCompetenze(Competenze competenze) {
		this.competenze = competenze;
	}

}