package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the figura_professionale database table.
 * 
 */
@Entity
@Table(name="figura_professionale")
@NamedQuery(name="FiguraProfessionale.findAll", query="SELECT f FROM FiguraProfessionale f")
public class FiguraProfessionale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String descrizione;

	//bi-directional many-to-one association to ClienteDipendente
	@OneToMany(mappedBy="figuraProfessionale")
	private List<ClienteDipendente> clienteDipendentes;

	public FiguraProfessionale() {
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

	public List<ClienteDipendente> getClienteDipendentes() {
		return this.clienteDipendentes;
	}

	public void setClienteDipendentes(List<ClienteDipendente> clienteDipendentes) {
		this.clienteDipendentes = clienteDipendentes;
	}

	public ClienteDipendente addClienteDipendente(ClienteDipendente clienteDipendente) {
		getClienteDipendentes().add(clienteDipendente);
		clienteDipendente.setFiguraProfessionale(this);

		return clienteDipendente;
	}

	public ClienteDipendente removeClienteDipendente(ClienteDipendente clienteDipendente) {
		getClienteDipendentes().remove(clienteDipendente);
		clienteDipendente.setFiguraProfessionale(null);

		return clienteDipendente;
	}

}