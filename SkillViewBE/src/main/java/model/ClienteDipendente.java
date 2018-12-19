package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cliente_dipendente database table.
 * 
 */
@Entity
@Table(name="cliente_dipendente")
@NamedQuery(name="ClienteDipendente.findAll", query="SELECT c FROM ClienteDipendente c")
public class ClienteDipendente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="costo_aziendale")
	private double costoAziendale;

	@Temporal(TemporalType.DATE)
	@Column(name="data_fine")
	private Date dataFine;

	@Temporal(TemporalType.DATE)
	@Column(name="data_inizio")
	private Date dataInizio;

	private String progetto;

	private double tariffa;

	//bi-directional many-to-one association to AnagraficaDipendenti
	@ManyToOne
	@JoinColumn(name="id_dipendente")
	private AnagraficaDipendenti anagraficaDipendenti;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;

	//bi-directional many-to-one association to FiguraProfessionale
	@ManyToOne
	@JoinColumn(name="id_figura_professionale")
	private FiguraProfessionale figuraProfessionale;

	public ClienteDipendente() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCostoAziendale() {
		return this.costoAziendale;
	}

	public void setCostoAziendale(double costoAziendale) {
		this.costoAziendale = costoAziendale;
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

	public String getProgetto() {
		return this.progetto;
	}

	public void setProgetto(String progetto) {
		this.progetto = progetto;
	}

	public double getTariffa() {
		return this.tariffa;
	}

	public void setTariffa(double tariffa) {
		this.tariffa = tariffa;
	}

	public AnagraficaDipendenti getAnagraficaDipendenti() {
		return this.anagraficaDipendenti;
	}

	public void setAnagraficaDipendenti(AnagraficaDipendenti anagraficaDipendenti) {
		this.anagraficaDipendenti = anagraficaDipendenti;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public FiguraProfessionale getFiguraProfessionale() {
		return this.figuraProfessionale;
	}

	public void setFiguraProfessionale(FiguraProfessionale figuraProfessionale) {
		this.figuraProfessionale = figuraProfessionale;
	}

}