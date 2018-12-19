package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utenza database table.
 * 
 */
@Entity
@NamedQuery(name="Utenza.findAll", query="SELECT u FROM Utenza u")
public class Utenza implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String password;

	private String username;

	//bi-directional many-to-one association to AnagraficaDipendenti
	@ManyToOne
	@JoinColumn(name="id_dipendente")
	private AnagraficaDipendenti anagraficaDipendenti;

	public Utenza() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public AnagraficaDipendenti getAnagraficaDipendenti() {
		return this.anagraficaDipendenti;
	}

	public void setAnagraficaDipendenti(AnagraficaDipendenti anagraficaDipendenti) {
		this.anagraficaDipendenti = anagraficaDipendenti;
	}

}