package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profili_dipendente database table.
 * 
 */
@Entity
@Table(name="profili_dipendente")
@NamedQuery(name="ProfiliDipendente.findAll", query="SELECT p FROM ProfiliDipendente p")
public class ProfiliDipendente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	//bi-directional many-to-one association to AnagraficaDipendenti
	@ManyToOne
	@JoinColumn(name="id_dipendente")
	private AnagraficaDipendenti anagraficaDipendenti;

	//bi-directional many-to-one association to Profili
	@ManyToOne
	@JoinColumn(name="id_profilo")
	private Profili profili;

	public ProfiliDipendente() {
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

	public Profili getProfili() {
		return this.profili;
	}

	public void setProfili(Profili profili) {
		this.profili = profili;
	}

}