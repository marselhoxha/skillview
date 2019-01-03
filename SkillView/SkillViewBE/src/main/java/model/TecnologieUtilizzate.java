package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tecnologie_utilizzate database table.
 * 
 */
@Entity
@Table(name="tecnologie_utilizzate")
@NamedQuery(name="TecnologieUtilizzate.findAll", query="SELECT t FROM TecnologieUtilizzate t")
public class TecnologieUtilizzate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="descrizione_tecnologia")
	private String descrizioneTecnologia;

	//bi-directional many-to-one association to AnagraficaDipendenti
	@ManyToOne
	@JoinColumn(name="id_dipendente")
	private AnagraficaDipendenti anagraficaDipendenti;

	//bi-directional many-to-one association to Competenze
	@ManyToOne
	@JoinColumn(name="id_competenza")
	private Competenze competenze;

	//bi-directional many-to-one association to EsperienzaLavorativa
	@ManyToOne
	@JoinColumn(name="id_esperienza_lavorativa")
	private EsperienzaLavorativa esperienzaLavorativa;

	public TecnologieUtilizzate() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescrizioneTecnologia() {
		return this.descrizioneTecnologia;
	}

	public void setDescrizioneTecnologia(String descrizioneTecnologia) {
		this.descrizioneTecnologia = descrizioneTecnologia;
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

	public EsperienzaLavorativa getEsperienzaLavorativa() {
		return this.esperienzaLavorativa;
	}

	public void setEsperienzaLavorativa(EsperienzaLavorativa esperienzaLavorativa) {
		this.esperienzaLavorativa = esperienzaLavorativa;
	}

}