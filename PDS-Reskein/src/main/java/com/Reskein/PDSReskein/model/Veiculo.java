//package com.Reskein.PDSReskein.model;
//
//import javax.persistence.Entity;
//
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Table;
//
////import org.hibernate.validator.constraints.NotBlank;
//import org.springframework.data.annotation.Id;
//
//@Entity
//@Table(name = "Veiculo")
//public class Veiculo {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int idVeiculo;
////	@NotBlank(message = "Modelo obrigatório")
//	private String modelo;
////	@NotBlank(message = "Lugares obrigatório")
//	private int lugares;
//	public int getIdVeiculo() {
//		return idVeiculo;
//	}
//	public void setIdVeiculo(int idVeiculo) {
//		this.idVeiculo = idVeiculo;
//	}
//	public String getModelo() {
//		return modelo;
//	}
//	public void setModelo(String modelo) {
//		this.modelo = modelo;
//	}
//	public int getLugares() {
//		return lugares;
//	}
//	public void setLugares(int lugares) {
//		this.lugares = lugares;
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + idVeiculo;
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Veiculo other = (Veiculo) obj;
//		if (idVeiculo != other.idVeiculo)
//			return false;
//		return true;
//	}
//	
//	
//	
//}
