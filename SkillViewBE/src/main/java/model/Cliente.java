package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String descrizione;

	private String sede;

	//bi-directional many-to-one association to ClienteDipendente
	@OneToMany(mappedBy="cliente")
	private List<ClienteDipendente> clienteDipendentes;

	public Cliente() {
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

	public String getSede() {
		return this.sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public List<ClienteDipendente> getClienteDipendentes() {
		return this.clienteDipendentes;
	}

	public void setClienteDipendentes(List<ClienteDipendente> clienteDipendentes) {
		this.clienteDipendentes = clienteDipendentes;
	}

	public ClienteDipendente addClienteDipendente(ClienteDipendente clienteDipendente) {
		getClienteDipendentes().add(clienteDipendente);
		clienteDipendente.setCliente(this);

		return clienteDipendente;
	}

	public ClienteDipendente removeClienteDipendente(ClienteDipendente clienteDipendente) {
		getClienteDipendentes().remove(clienteDipendente);
		clienteDipendente.setCliente(null);

		return clienteDipendente;
	}

}