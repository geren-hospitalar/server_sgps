package br.com.sgps.serverSgps.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicos")
public class Medicos implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer medId;
	private String medNome;
	private String medEspec;
	private Integer medCrm;
	
	@Column(name = "MED_END")
	private String medEndereco;
	
	private Integer medTel;
	private LocalDateTime medDtNasc;
	
	public Medicos() {}
	
	
	public Medicos(Integer medId, String medNome, String medEspec, Integer medCrm, String medEndereco, Integer medTel,
			LocalDateTime medDtNasc) {
		super();
		this.medId = medId;
		this.medNome = medNome;
		this.medEspec = medEspec;
		this.medCrm = medCrm;
		this.medEndereco = medEndereco;
		this.medTel = medTel;
		this.medDtNasc = medDtNasc;
	}

	public Integer getMedId() {
		return medId;
	}
	public void setMedId(Integer medId) {
		this.medId = medId;
	}
	public String getMedNome() {
		return medNome;
	}
	public void setMedNome(String medNome) {
		this.medNome = medNome;
	}
	public String getMedEspec() {
		return medEspec;
	}
	public void setMedEspec(String medEspec) {
		this.medEspec = medEspec;
	}
	public Integer getMedCrm() {
		return medCrm;
	}
	public void setMedCrm(Integer medCrm) {
		this.medCrm = medCrm;
	}
	public String getMedEndereco() {
		return medEndereco;
	}
	public void setMedEndereco(String medEndereco) {
		this.medEndereco = medEndereco;
	}
	public Integer getMedTel() {
		return medTel;
	}
	public void setMedTel(Integer medTel) {
		this.medTel = medTel;
	}
	public LocalDateTime getMedDtNasc() {
		return medDtNasc;
	}
	public void setMedDtNasc(LocalDateTime medDtNasc) {
		this.medDtNasc = medDtNasc;
	}	

}
