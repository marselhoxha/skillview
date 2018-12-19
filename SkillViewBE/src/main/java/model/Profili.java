package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the profili database table.
 * 
 */
@Entity
@NamedQuery(name="Profili.findAll", query="SELECT p FROM Profili p")
public class Profili implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String descrizione;

	//bi-directional many-to-one association to ProfiliDipendente
	@OneToMany(mappedBy="profili")
	private List<ProfiliDipendente> profiliDipendentes;

	public Profili() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public List<ProfiliDipendente> getProfiliDipendentes() {
		return this.profiliDipendentes;
	}

	public void setProfiliDipendentes(List<ProfiliDipendente> profiliDipendentes) {
		this.profiliDipendentes = profiliDipendentes;
	}

	public ProfiliDipendente addProfiliDipendente(ProfiliDipendente profiliDipendente) {
		getProfiliDipendentes().add(profiliDipendente);
		profiliDipendente.setProfili(this);

		return profiliDipendente;
	}

	public ProfiliDipendente removeProfiliDipendente(ProfiliDipendente profiliDipendente) {
		getProfiliDipendentes().remove(profiliDipendente);
		profiliDipendente.setProfili(null);

		return profiliDipendente;
	}

}