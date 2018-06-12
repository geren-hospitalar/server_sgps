package br.com.sgps.serverSgps.models;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hospitais")
public class Hospitais implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer hosId;
	
	private String hospNome;
	private BigInteger hospCnpj;
	
	@Column(name = "HOSP_END")
	private String hospEndereco;
	
	private Integer hospTel;
	
	public Hospitais() {}

	public Hospitais(Integer hosId, String hospNome, BigInteger hospCnpj, String hospEndereco, Integer hospTel) {
		super();
		this.hosId = hosId;
		this.hospNome = hospNome;
		this.hospCnpj = hospCnpj;
		this.hospEndereco = hospEndereco;
		this.hospTel = hospTel;
	}

	public Integer getHosId() {
		return hosId;
	}

	public void setHosId(Integer hosId) {
		this.hosId = hosId;
	}

	public String getHospNome() {
		return hospNome;
	}

	public void setHospNome(String hospNome) {
		this.hospNome = hospNome;
	}

	public BigInteger getHospCnpj() {
		return hospCnpj;
	}

	public void setHospCnpj(BigInteger hospCnpj) {
		this.hospCnpj = hospCnpj;
	}

	public String getHospEndereco() {
		return hospEndereco;
	}

	public void setHospEndereco(String hospEndereco) {
		this.hospEndereco = hospEndereco;
	}

	public Integer getHospTel() {
		return hospTel;
	}

	public void setHospTel(Integer hospTel) {
		this.hospTel = hospTel;
	}	
	
}
