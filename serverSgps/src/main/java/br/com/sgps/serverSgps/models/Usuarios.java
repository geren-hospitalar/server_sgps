package br.com.sgps.serverSgps.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer usuId;
	private String usuNome;
	private String usuSenha;
	
	
	public Usuarios() {}


	public Usuarios(Integer usuId, String usuNome, String usuSenha) {
		super();
		this.usuId = usuId;
		this.usuNome = usuNome;
		this.usuSenha = usuSenha;
	}


	public Integer getUsuId() {
		return usuId;
	}


	public void setUsuId(Integer usuId) {
		this.usuId = usuId;
	}


	public String getUsuNome() {
		return usuNome;
	}


	public void setUsuNome(String usuNome) {
		this.usuNome = usuNome;
	}


	public String getUsuSenha() {
		return usuSenha;
	}


	public void setUsuSenha(String usuSenha) {
		this.usuSenha = usuSenha;
	}
	
	
}
