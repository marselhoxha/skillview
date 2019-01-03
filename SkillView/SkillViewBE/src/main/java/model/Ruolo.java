package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ruolo database table.
 * 
 */
@Entity
@NamedQuery(name="Ruolo.findAll", query="SELECT r FROM Ruolo r")
public class Ruolo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="descrizione_ruolo_lavorativo")
	private String descrizioneRuoloLavorativo;

	//bi-directional many-to-one association to EsperienzaLavorativa
	@OneToMany(mappedBy="ruolo")
	private List<EsperienzaLavorativa> esperienzaLavorativas;

	public Ruolo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescrizioneRuoloLavorativo() {
		return this.descrizioneRuoloLavorativo;
	}

	public void setDescrizioneRuoloLavorativo(String descrizioneRuoloLavorativo) {
		this.descrizioneRuoloLavorativo = descrizioneRuoloLavorativo;
	}

	public List<EsperienzaLavorativa> getEsperienzaLavorativas() {
		return this.esperienzaLavorativas;
	}

	public void setEsperienzaLavorativas(List<EsperienzaLavorativa> esperienzaLavorativas) {
		this.esperienzaLavorativas = esperienzaLavorativas;
	}

	public EsperienzaLavorativa addEsperienzaLavorativa(EsperienzaLavorativa esperienzaLavorativa) {
		getEsperienzaLavorativas().add(esperienzaLavorativa);
		esperienzaLavorativa.setRuolo(this);

		return esperienzaLavorativa;
	}

	public EsperienzaLavorativa removeEsperienzaLavorativa(EsperienzaLavorativa esperienzaLavorativa) {
		getEsperienzaLavorativas().remove(esperienzaLavorativa);
		esperienzaLavorativa.setRuolo(null);

		return esperienzaLavorativa;
	}

}