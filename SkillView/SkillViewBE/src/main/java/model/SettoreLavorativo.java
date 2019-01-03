package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the settore_lavorativo database table.
 * 
 */
@Entity
@Table(name="settore_lavorativo")
@NamedQuery(name="SettoreLavorativo.findAll", query="SELECT s FROM SettoreLavorativo s")
public class SettoreLavorativo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="descrizione_settore_lavorativo")
	private String descrizioneSettoreLavorativo;

	//bi-directional many-to-one association to EsperienzaLavorativa
	@OneToMany(mappedBy="settoreLavorativo")
	private List<EsperienzaLavorativa> esperienzaLavorativas;

	public SettoreLavorativo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescrizioneSettoreLavorativo() {
		return this.descrizioneSettoreLavorativo;
	}

	public void setDescrizioneSettoreLavorativo(String descrizioneSettoreLavorativo) {
		this.descrizioneSettoreLavorativo = descrizioneSettoreLavorativo;
	}

	public List<EsperienzaLavorativa> getEsperienzaLavorativas() {
		return this.esperienzaLavorativas;
	}

	public void setEsperienzaLavorativas(List<EsperienzaLavorativa> esperienzaLavorativas) {
		this.esperienzaLavorativas = esperienzaLavorativas;
	}

	public EsperienzaLavorativa addEsperienzaLavorativa(EsperienzaLavorativa esperienzaLavorativa) {
		getEsperienzaLavorativas().add(esperienzaLavorativa);
		esperienzaLavorativa.setSettoreLavorativo(this);

		return esperienzaLavorativa;
	}

	public EsperienzaLavorativa removeEsperienzaLavorativa(EsperienzaLavorativa esperienzaLavorativa) {
		getEsperienzaLavorativas().remove(esperienzaLavorativa);
		esperienzaLavorativa.setSettoreLavorativo(null);

		return esperienzaLavorativa;
	}

}