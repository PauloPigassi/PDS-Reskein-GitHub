package com.Reskein.PDSReskein.model;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.Id;

@Entity
@Table(name = "GastoExtra")
public class GastoExtra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idGastoExtra;
	@NotBlank(message = "Descricao obrigatória")
	private String descricao;
	@NotBlank(message = "Valor obrigatório")
	private Double valor;
	public int getIdGastoExtra() {
		return idGastoExtra;
	}
	public void setIdGastoExtra(int idGastoExtra) {
		this.idGastoExtra = idGastoExtra;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idGastoExtra;
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
		GastoExtra other = (GastoExtra) obj;
		if (idGastoExtra != other.idGastoExtra)
			return false;
		return true;
	}
	
	
	

}
