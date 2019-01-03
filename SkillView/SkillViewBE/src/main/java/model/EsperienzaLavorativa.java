package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the esperienza_lavorativa database table.
 * 
 */
@Entity
@Table(name="esperienza_lavorativa")
@NamedQuery(name="EsperienzaLavorativa.findAll", query="SELECT e FROM EsperienzaLavorativa e")
public class EsperienzaLavorativa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="azienda_cliente")
	private String aziendaCliente;

	@Temporal(TemporalType.DATE)
	@Column(name="data_fine")
	private Date dataFine;

	@Temporal(TemporalType.DATE)
	@Column(name="data_inizio")
	private Date dataInizio;

	@Column(name="descrizione_profilo")
	private String descrizioneProfilo;

	//bi-directional many-to-one association to AnagraficaDipendenti
	@ManyToOne
	@JoinColumn(name="id_dipendente")
	private AnagraficaDipendenti anagraficaDipendenti;

	//bi-directional many-to-one association to Ruolo
	@ManyToOne
	@JoinColumn(name="id_ruolo")
	private Ruolo ruolo;

	//bi-directional many-to-one association to SettoreLavorativo
	@ManyToOne
	@JoinColumn(name="id_settore_lavorativo")
	private SettoreLavorativo settoreLavorativo;

	//bi-directional many-to-one association to TecnologieUtilizzate
	@OneToMany(mappedBy="esperienzaLavorativa")
	private List<TecnologieUtilizzate> tecnologieUtilizzates;

	public EsperienzaLavorativa() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAziendaCliente() {
		return this.aziendaCliente;
	}

	public void setAziendaCliente(String aziendaCliente) {
		this.aziendaCliente = aziendaCliente;
	}

	public Date getDataFine() {
		return this.dataFine;
	}

	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}

	public Date getDataInizio() {
		return this.dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public String getDescrizioneProfilo() {
		return this.descrizioneProfilo;
	}

	public void setDescrizioneProfilo(String descrizioneProfilo) {
		this.descrizioneProfilo = descrizioneProfilo;
	}

	public AnagraficaDipendenti getAnagraficaDipendenti() {
		return this.anagraficaDipendenti;
	}

	public void setAnagraficaDipendenti(AnagraficaDipendenti anagraficaDipendenti) {
		this.anagraficaDipendenti = anagraficaDipendenti;
	}

	public Ruolo getRuolo() {
		return this.ruolo;
	}

	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}

	public SettoreLavorativo getSettoreLavorativo() {
		return this.settoreLavorativo;
	}

	public void setSettoreLavorativo(SettoreLavorativo settoreLavorativo) {
		this.settoreLavorativo = settoreLavorativo;
	}

	public List<TecnologieUtilizzate> getTecnologieUtilizzates() {
		return this.tecnologieUtilizzates;
	}

	public void setTecnologieUtilizzates(List<TecnologieUtilizzate> tecnologieUtilizzates) {
		this.tecnologieUtilizzates = tecnologieUtilizzates;
	}

	public TecnologieUtilizzate addTecnologieUtilizzate(TecnologieUtilizzate tecnologieUtilizzate) {
		getTecnologieUtilizzates().add(tecnologieUtilizzate);
		tecnologieUtilizzate.setEsperienzaLavorativa(this);

		return tecnologieUtilizzate;
	}

	public TecnologieUtilizzate removeTecnologieUtilizzate(TecnologieUtilizzate tecnologieUtilizzate) {
		getTecnologieUtilizzates().remove(tecnologieUtilizzate);
		tecnologieUtilizzate.setEsperienzaLavorativa(null);

		return tecnologieUtilizzate;
	}

}