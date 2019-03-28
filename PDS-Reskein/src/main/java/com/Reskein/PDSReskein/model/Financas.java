//package com.Reskein.PDSReskein.model;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import org.hibernate.validator.constraints.NotBlank;
//import org.springframework.data.annotation.Id;
//
//@Entity
//@Table(name = "Finanças")
//public class Financas {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int idFinancas;
//	@NotBlank(message = "Mensalidade obrigatório")
//	private Double mensalidade;
//	@NotBlank(message = "Quantidade de alunos obrigatório")
//	private int quantidadeAlunos;
//	@NotBlank(message = "Gasto dia obrigatório")
//	private int idGastoDia;
//	@NotBlank(message = "Gasto extra obrigatório")
//	private int idGastoExtra;
//	
////	Lista de alunos em financas
//	@ManyToOne
//	@JoinColumn(name = "Aluno")
//	List<Aluno> quantidadealunos;
//	
//	//Objeto gastodia, chave estrangeira
//	@OneToOne(mappedBy = "Finanças", fetch = FetchType.EAGER)
//	private GastoDia gastoDia;
//	
//	//Objeto gastoextra, chave estrangeira
//	@OneToOne(mappedBy = "Finanças", fetch = FetchType.EAGER)
//	private GastoExtra gastoExtra;
//
//	public int getIdFinancas() {
//		return idFinancas;
//	}
//
//	public void setIdFinancas(int idFinancas) {
//		this.idFinancas = idFinancas;
//	}
//
//	public Double getMensalidade() {
//		return mensalidade;
//	}
//
//	public void setMensalidade(Double mensalidade) {
//		this.mensalidade = mensalidade;
//	}
//
//	public int getQuantidadeAlunos() {
//		return quantidadeAlunos;
//	}
//
//	public void setQuantidadeAlunos(int quantidadeAlunos) {
//		this.quantidadeAlunos = quantidadeAlunos;
//	}
//
//	public int getIdGastoDia() {
//		return idGastoDia;
//	}
//
//	public void setIdGastoDia(int idGastoDia) {
//		this.idGastoDia = idGastoDia;
//	}
//
//	public int getIdGastoExtra() {
//		return idGastoExtra;
//	}
//
//	public void setIdGastoExtra(int idGastoExtra) {
//		this.idGastoExtra = idGastoExtra;
//	}
//
//	public GastoDia getGastoDia() {
//		return gastoDia;
//	}
//
//	public void setGastoDia(GastoDia gastoDia) {
//		this.gastoDia = gastoDia;
//	}
//
//	public GastoExtra getGastoExtra() {
//		return gastoExtra;
//	}
//
//	public void setGastoExtra(GastoExtra gastoExtra) {
//		this.gastoExtra = gastoExtra;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + idFinancas;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Financas other = (Financas) obj;
//		if (idFinancas != other.idFinancas)
//			return false;
//		return true;
//	}
//	
//	
//	
//	
//}
