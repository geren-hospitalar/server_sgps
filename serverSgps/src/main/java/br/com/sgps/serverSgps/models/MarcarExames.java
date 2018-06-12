package br.com.sgps.serverSgps.models;

import java.io.Serializable;
import java.sql.Time;
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
@Table(name = "marcar_exames")
public class MarcarExames implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MEXA_ID")
	private Integer mexaId;
	
	private String mexaNome;
	
	@Column(name = "MEXA_OBS")
	private String mexaObservacao;
	
	private LocalDateTime mexaData;
	
	private Time mexaHora;
	
	@ManyToOne
	@JoinColumn(name = "MEXA_CLI", referencedColumnName = "CLI_ID")
	private Clientes cliente;
	
	@ManyToOne
	@JoinColumn(name = "MEXA_HOSP", referencedColumnName = "HOSP_ID")
	private Hospitais hospitais;
	
	@ManyToOne
	@JoinColumn(name = "FK_MCONS_ID", referencedColumnName = "MCONS_ID")
	private MarcarConsultas marcarConsulta;
	
	public MarcarExames() {}

	public MarcarExames(Integer mexaId, String mexaNome, String mexaObservacao, LocalDateTime mexaData, Time mexaHora,
			Clientes cliente, Hospitais hospitais, MarcarConsultas marcarConsulta) {
		super();
		this.mexaId = mexaId;
		this.mexaNome = mexaNome;
		this.mexaObservacao = mexaObservacao;
		this.mexaData = mexaData;
		this.mexaHora = mexaHora;
		this.cliente = cliente;
		this.hospitais = hospitais;
		this.marcarConsulta = marcarConsulta;
	}

	public Integer getMexaId() {
		return mexaId;
	}

	public void setMexaId(Integer mexaId) {
		this.mexaId = mexaId;
	}

	public String getMexaNome() {
		return mexaNome;
	}

	public void setMexaNome(String mexaNome) {
		this.mexaNome = mexaNome;
	}

	public String getMexaObservacao() {
		return mexaObservacao;
	}

	public void setMexaObservacao(String mexaObservacao) {
		this.mexaObservacao = mexaObservacao;
	}

	public LocalDateTime getMexaData() {
		return mexaData;
	}

	public void setMexaData(LocalDateTime mexaData) {
		this.mexaData = mexaData;
	}

	public Time getMexaHora() {
		return mexaHora;
	}

	public void setMexaHora(Time mexaHora) {
		this.mexaHora = mexaHora;
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

	public MarcarConsultas getMarcarConsulta() {
		return marcarConsulta;
	}

	public void setMarcarConsulta(MarcarConsultas marcarConsulta) {
		this.marcarConsulta = marcarConsulta;
	}	
	
}
