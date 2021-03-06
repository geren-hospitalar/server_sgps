package br.com.sgps.serverSgps.models;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "marca_consultas")
public class MarcarConsultas implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MCONS_ID")
	private Integer mconsId;
	
	private LocalDate mconsData;
	private Time mconsHora;
	
	@ManyToOne
	@JoinColumn(name = "FK_MCONS_MED", referencedColumnName = "MED_ID")
	private Medicos medico;
	
	@ManyToOne
	@JoinColumn(name = "FK_MCONS_CLI", referencedColumnName = "CLI_ID")
	private Clientes cliente;
	
	@ManyToOne
	@JoinColumn(name = "FK_MCONS_HOSP", referencedColumnName = "HOSP_ID")
	private Hospitais hospitais;
	
	public MarcarConsultas() {}

	public MarcarConsultas(Integer mconsId, LocalDate mconsData, Time mconsHora, Medicos medico, Clientes cliente,
			Hospitais hospitais) {
		super();
		this.mconsId = mconsId;
		this.mconsData = mconsData;
		this.mconsHora = mconsHora;
		this.medico = medico;
		this.cliente = cliente;
		this.hospitais = hospitais;
	}

	public Integer getMconsId() {
		return mconsId;
	}

	public void setMconsId(Integer mconsId) {
		this.mconsId = mconsId;
	}

	public LocalDate getMconsData() {
		return mconsData;
	}

	public void setMconsData(LocalDate mconsData) {
		this.mconsData = mconsData;
	}

	public Time getMconsHora() {
		return mconsHora;
	}

	public void setMconsHora(Time mconsHora) {
		this.mconsHora = mconsHora;
	}

	public Medicos getMedico() {
		return medico;
	}

	public void setMedico(Medicos medico) {
		this.medico = medico;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public Hospitais getHospitais() {
		return hospitais;
	}

	public void setHospitais(Hospitais hospitais) {
		this.hospitais = hospitais;
	}	
}
