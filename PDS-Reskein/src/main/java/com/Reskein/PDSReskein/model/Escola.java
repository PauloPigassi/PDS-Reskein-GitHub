package com.Reskein.PDSReskein.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.Id;

@Entity
@Table(name = "Escola")
public class Escola {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEscola;
	@NotBlank(message = "endereço obrigatório")
	private String endereco;
	@NotBlank(message = "nome obrigatório")
	private String nome;
	@NotBlank(message = "Telefone obrigatório")
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdEscola() {
		return idEscola;
	}
	public void setIdEscola(int idEscola) {
		this.idEscola = idEscola;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEscola;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Escola other = (Escola) obj;
		if (idEscola != other.idEscola)
			return false;
		return true;
	}
	
	
}
