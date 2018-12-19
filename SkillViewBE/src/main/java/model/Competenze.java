package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the competenze database table.
 * 
 */
@Entity
@NamedQuery(name="Competenze.findAll", query="SELECT c FROM Competenze c")
public class Competenze implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String descrizione;

	//bi-directional many-to-one association to AreaCompetenze
	@ManyToOne
	@JoinColumn(name="id_area_competenza")
	private AreaCompetenze areaCompetenze;

	//bi-directional many-to-one association to Cv
	@OneToMany(mappedBy="competenze")
	private List<Cv> cvs;

	//bi-directional many-to-one association to TecnologieUtilizzate
	@OneToMany(mappedBy="competenze")
	private List<TecnologieUtilizzate> tecnologieUtilizzates;

	public Competenze() {
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

	public AreaCompetenze getAreaCompetenze() {
		return this.areaCompetenze;
	}

	public void setAreaCompetenze(AreaCompetenze areaCompetenze) {
		this.areaCompetenze = areaCompetenze;
	}

	public List<Cv> getCvs() {
		return this.cvs;
	}

	public void setCvs(List<Cv> cvs) {
		this.cvs = cvs;
	}

	public Cv addCv(Cv cv) {
		getCvs().add(cv);
		cv.setCompetenze(this);

		return cv;
	}

	public Cv removeCv(Cv cv) {
		getCvs().remove(cv);
		cv.setCompetenze(null);

		return cv;
	}

	public List<TecnologieUtilizzate> getTecnologieUtilizzates() {
		return this.tecnologieUtilizzates;
	}

	public void setTecnologieUtilizzates(List<TecnologieUtilizzate> tecnologieUtilizzates) {
		this.tecnologieUtilizzates = tecnologieUtilizzates;
	}

	public TecnologieUtilizzate addTecnologieUtilizzate(TecnologieUtilizzate tecnologieUtilizzate) {
		getTecnologieUtilizzates().add(tecnologieUtilizzate);
		tecnologieUtilizzate.setCompetenze(this);

		return tecnologieUtilizzate;
	}

	public TecnologieUtilizzate removeTecnologieUtilizzate(TecnologieUtilizzate tecnologieUtilizzate) {
		getTecnologieUtilizzates().remove(tecnologieUtilizzate);
		tecnologieUtilizzate.setCompetenze(null);

		return tecnologieUtilizzate;
	}

}