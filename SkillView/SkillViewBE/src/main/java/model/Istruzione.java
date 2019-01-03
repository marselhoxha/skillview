package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the istruzione database table.
 * 
 */
@Entity
@NamedQuery(name="Istruzione.findAll", query="SELECT i FROM Istruzione i")
public class Istruzione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="anno_conseguimento")
	private Date annoConseguimento;

	private String istituto;

	private String tipologia;

	private String titolo;

	private int voto;

	//bi-directional many-to-one association to AnagraficaDipendenti
	@ManyToOne
	@JoinColumn(name="id_dipendente")
	private AnagraficaDipendenti anagraficaDipendenti;

	public Istruzione() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getAnnoConseguimento() {
		return this.annoConseguimento;
	}

	public void setAnnoConseguimento(Date annoConseguimento) {
		this.annoConseguimento = annoConseguimento;
	}

	public String getIstituto() {
		return this.istituto;
	}

	public void setIstituto(String istituto) {
		this.istituto = istituto;
	}

	public String getTipologia() {
		return this.tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public String getTitolo() {
		return this.titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getVoto() {
		return this.voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public AnagraficaDipendenti getAnagraficaDipendenti() {
		return this.anagraficaDipendenti;
	}

	public void setAnagraficaDipendenti(AnagraficaDipendenti anagraficaDipendenti) {
		this.anagraficaDipendenti = anagraficaDipendenti;
	}

}