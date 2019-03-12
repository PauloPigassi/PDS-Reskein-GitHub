//package com.Reskein.PDSReskein.model;
//
//import java.util.Date;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Table;
//
//import org.hibernate.validator.constraints.NotBlank;
//import org.springframework.data.annotation.Id;
//
//@Entity
//@Table(name = "GastoDia")
//public class GastoDia {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int idGastoDia;
//	@NotBlank(message = "Preço combustivel obrigatório")
//	private Double precoCombustivel;
//	@NotBlank(message = "Dia abastecimento obrigatório")
//	private Date diaAbastecimento;
//	@NotBlank(message = "Quantidade combustivel obrigatório")
//	private Double quantidadeCombustivel;
//	@NotBlank(message = "Km por litro obrigatório")
//	private Float kmPorLitro;
//	@NotBlank(message = "Custo dia obrigatório")
//	private Double custoDia;
//	public int getIdGastoDia() {
//		return idGastoDia;
//	}
//	public void setIdGastoDia(int idGastoDia) {
//		this.idGastoDia = idGastoDia;
//	}
//	public Double getPrecoCombustivel() {
//		return precoCombustivel;
//	}
//	public void setPrecoCombustivel(Double precoCombustivel) {
//		this.precoCombustivel = precoCombustivel;
//	}
//	public Date getDiaAbastecimento() {
//		return diaAbastecimento;
//	}
//	public void setDiaAbastecimento(Date diaAbastecimento) {
//		this.diaAbastecimento = diaAbastecimento;
//	}
//	public Double getQuantidadeCombustivel() {
//		return quantidadeCombustivel;
//	}
//	public void setQuantidadeCombustivel(Double quantidadeCombustivel) {
//		this.quantidadeCombustivel = quantidadeCombustivel;
//	}
//	public Float getKmPorLitro() {
//		return kmPorLitro;
//	}
//	public void setKmPorLitro(Float kmPorLitro) {
//		this.kmPorLitro = kmPorLitro;
//	}
//	public Double getCustoDia() {
//		return custoDia;
//	}
//	public void setCustoDia(Double custoDia) {
//		this.custoDia = custoDia;
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + idGastoDia;
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
//		GastoDia other = (GastoDia) obj;
//		if (idGastoDia != other.idGastoDia)
//			return false;
//		return true;
//	}
//	
//	
//	
//}
