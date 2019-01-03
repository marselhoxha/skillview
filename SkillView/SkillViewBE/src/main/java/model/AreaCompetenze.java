package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the area_competenze database table.
 * 
 */
@Entity
@Table(name="area_competenze")
@NamedQuery(name="AreaCompetenze.findAll", query="SELECT a FROM AreaCompetenze a")
public class AreaCompetenze implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String descrizione;

	//bi-directional many-to-one association to Competenze
	@OneToMany(mappedBy="areaCompetenze")
	private List<Competenze> competenzes;

	public AreaCompetenze() {
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

	public List<Competenze> getCompetenzes() {
		return this.competenzes;
	}

	public void setCompetenzes(List<Competenze> competenzes) {
		this.competenzes = competenzes;
	}

	public Competenze addCompetenze(Competenze competenze) {
		getCompetenzes().add(competenze);
		competenze.setAreaCompetenze(this);

		return competenze;
	}

	public Competenze removeCompetenze(Competenze competenze) {
		getCompetenzes().remove(competenze);
		competenze.setAreaCompetenze(null);

		return competenze;
	}

}