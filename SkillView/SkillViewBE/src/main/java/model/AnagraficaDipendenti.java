package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the anagrafica_dipendenti database table.
 * 
 */
@Entity
@Table(name="anagrafica_dipendenti")
@NamedQuery(name="AnagraficaDipendenti.findAll", query="SELECT a FROM AnagraficaDipendenti a")
public class AnagraficaDipendenti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int cap;

	private String cf;

	private String citta;

	private String cognome;

	@Temporal(TemporalType.DATE)
	@Column(name="data_nascita")
	private Date dataNascita;

	private String email;

	private String indirizzo;

	private String nome;

	private String provincia;

	private String regione;

	private String sesso;

	private int telefono;

	//bi-directional many-to-one association to ClienteDipendente
	@OneToMany(mappedBy="anagraficaDipendenti")
	private List<ClienteDipendente> clienteDipendentes;

	//bi-directional many-to-one association to Cv
	@OneToMany(mappedBy="anagraficaDipendenti")
	private List<Cv> cvs;

	//bi-directional many-to-one association to EsperienzaLavorativa
	@OneToMany(mappedBy="anagraficaDipendenti")
	private List<EsperienzaLavorativa> esperienzaLavorativas;

	//bi-directional many-to-one association to Istruzione
	@OneToMany(mappedBy="anagraficaDipendenti")
	private List<Istruzione> istruziones;

	//bi-directional many-to-one association to ProfiliDipendente
	@OneToMany(mappedBy="anagraficaDipendenti")
	private List<ProfiliDipendente> profiliDipendentes;

	//bi-directional many-to-one association to TecnologieUtilizzate
	@OneToMany(mappedBy="anagraficaDipendenti")
	private List<TecnologieUtilizzate> tecnologieUtilizzates;

	//bi-directional many-to-one association to Utenza
	@OneToMany(mappedBy="anagraficaDipendenti")
	private List<Utenza> utenzas;

	public AnagraficaDipendenti() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCap() {
		return this.cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public String getCf() {
		return this.cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getCitta() {
		return this.citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getDataNascita() {
		return this.dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIndirizzo() {
		return this.indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getRegione() {
		return this.regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public String getSesso() {
		return this.sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public List<ClienteDipendente> getClienteDipendentes() {
		return this.clienteDipendentes;
	}

	public void setClienteDipendentes(List<ClienteDipendente> clienteDipendentes) {
		this.clienteDipendentes = clienteDipendentes;
	}

	public ClienteDipendente addClienteDipendente(ClienteDipendente clienteDipendente) {
		getClienteDipendentes().add(clienteDipendente);
		clienteDipendente.setAnagraficaDipendenti(this);

		return clienteDipendente;
	}

	public ClienteDipendente removeClienteDipendente(ClienteDipendente clienteDipendente) {
		getClienteDipendentes().remove(clienteDipendente);
		clienteDipendente.setAnagraficaDipendenti(null);

		return clienteDipendente;
	}

	public List<Cv> getCvs() {
		return this.cvs;
	}

	public void setCvs(List<Cv> cvs) {
		this.cvs = cvs;
	}

	public Cv addCv(Cv cv) {
		getCvs().add(cv);
		cv.setAnagraficaDipendenti(this);

		return cv;
	}

	public Cv removeCv(Cv cv) {
		getCvs().remove(cv);
		cv.setAnagraficaDipendenti(null);

		return cv;
	}

	public List<EsperienzaLavorativa> getEsperienzaLavorativas() {
		return this.esperienzaLavorativas;
	}

	public void setEsperienzaLavorativas(List<EsperienzaLavorativa> esperienzaLavorativas) {
		this.esperienzaLavorativas = esperienzaLavorativas;
	}

	public EsperienzaLavorativa addEsperienzaLavorativa(EsperienzaLavorativa esperienzaLavorativa) {
		getEsperienzaLavorativas().add(esperienzaLavorativa);
		esperienzaLavorativa.setAnagraficaDipendenti(this);

		return esperienzaLavorativa;
	}

	public EsperienzaLavorativa removeEsperienzaLavorativa(EsperienzaLavorativa esperienzaLavorativa) {
		getEsperienzaLavorativas().remove(esperienzaLavorativa);
		esperienzaLavorativa.setAnagraficaDipendenti(null);

		return esperienzaLavorativa;
	}

	public List<Istruzione> getIstruziones() {
		return this.istruziones;
	}

	public void setIstruziones(List<Istruzione> istruziones) {
		this.istruziones = istruziones;
	}

	public Istruzione addIstruzione(Istruzione istruzione) {
		getIstruziones().add(istruzione);
		istruzione.setAnagraficaDipendenti(this);

		return istruzione;
	}

	public Istruzione removeIstruzione(Istruzione istruzione) {
		getIstruziones().remove(istruzione);
		istruzione.setAnagraficaDipendenti(null);

		return istruzione;
	}

	public List<ProfiliDipendente> getProfiliDipendentes() {
		return this.profiliDipendentes;
	}

	public void setProfiliDipendentes(List<ProfiliDipendente> profiliDipendentes) {
		this.profiliDipendentes = profiliDipendentes;
	}

	public ProfiliDipendente addProfiliDipendente(ProfiliDipendente profiliDipendente) {
		getProfiliDipendentes().add(profiliDipendente);
		profiliDipendente.setAnagraficaDipendenti(this);

		return profiliDipendente;
	}

	public ProfiliDipendente removeProfiliDipendente(ProfiliDipendente profiliDipendente) {
		getProfiliDipendentes().remove(profiliDipendente);
		profiliDipendente.setAnagraficaDipendenti(null);

		return profiliDipendente;
	}

	public List<TecnologieUtilizzate> getTecnologieUtilizzates() {
		return this.tecnologieUtilizzates;
	}

	public void setTecnologieUtilizzates(List<TecnologieUtilizzate> tecnologieUtilizzates) {
		this.tecnologieUtilizzates = tecnologieUtilizzates;
	}

	public TecnologieUtilizzate addTecnologieUtilizzate(TecnologieUtilizzate tecnologieUtilizzate) {
		getTecnologieUtilizzates().add(tecnologieUtilizzate);
		tecnologieUtilizzate.setAnagraficaDipendenti(this);

		return tecnologieUtilizzate;
	}

	public TecnologieUtilizzate removeTecnologieUtilizzate(TecnologieUtilizzate tecnologieUtilizzate) {
		getTecnologieUtilizzates().remove(tecnologieUtilizzate);
		tecnologieUtilizzate.setAnagraficaDipendenti(null);

		return tecnologieUtilizzate;
	}

	public List<Utenza> getUtenzas() {
		return this.utenzas;
	}

	public void setUtenzas(List<Utenza> utenzas) {
		this.utenzas = utenzas;
	}

	public Utenza addUtenza(Utenza utenza) {
		getUtenzas().add(utenza);
		utenza.setAnagraficaDipendenti(this);

		return utenza;
	}

	public Utenza removeUtenza(Utenza utenza) {
		getUtenzas().remove(utenza);
		utenza.setAnagraficaDipendenti(null);

		return utenza;
	}

}