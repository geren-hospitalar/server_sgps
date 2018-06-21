package br.com.sgps.serverSgps.models;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CLI_ID")
	private Integer cliId;
	
	private String cliNome;
	private BigInteger cliCpf;
	
	@Column(name = "CLI_END")
	private String cliEndereco;
	
	private Integer cliTel;
	private String cliDtNasc;
	
	public Clientes() {}

	public Clientes(Integer cliId, String cliNome, BigInteger cliCpf, String cliEndereco, Integer cliTel,
			String cliDtNasc) {
		super();
		this.cliId = cliId;
		this.cliNome = cliNome;
		this.cliCpf = cliCpf;
		this.cliEndereco = cliEndereco;
		this.cliTel = cliTel;
		this.cliDtNasc = cliDtNasc;
	}

	public Integer getCliId() {
		return cliId;
	}

	public void setCliId(Integer cliId) {
		this.cliId = cliId;
	}

	public String getCliNome() {
		return cliNome;
	}

	public void setCliNome(String cliNome) {
		this.cliNome = cliNome;
	}

	public BigInteger getCliCpf() {
		return cliCpf;
	}

	public void setCliCpf(BigInteger cliCpf) {
		this.cliCpf = cliCpf;
	}

	public String getCliEndereco() {
		return cliEndereco;
	}

	public void setCliEndereco(String cliEndereco) {
		this.cliEndereco = cliEndereco;
	}

	public Integer getCliTel() {
		return cliTel;
	}

	public void setCliTel(Integer cliTel) {
		this.cliTel = cliTel;
	}

	public String getCliDtNasc() {
		return cliDtNasc;
	}

	public void setCliDtNasc(String cliDtNasc) {
		
		this.cliDtNasc = cliDtNasc;
	}
		
}
