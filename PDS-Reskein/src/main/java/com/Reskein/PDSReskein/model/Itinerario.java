//package com.Reskein.PDSReskein.model;
//
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import org.hibernate.validator.constraints.NotBlank;
//import org.springframework.data.annotation.Id;
//
//@Entity
//@Table(name = "Itinerario")
//public class Itinerario {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int idItinerario;
//	@NotBlank(message = "Distância obrigatória")
//	private Double distancia;
//	private int idPerueiro;
//	@NotBlank(message = "ID perueiro obrigatóriao")
//	private int idAluno;
//	@NotBlank(message = "ID aluno obrigatório")
//	private int idEscola;
//	@NotBlank(message = "ID escola obrigatória")
//	
//	
//	//Endereco perueiro
//	@OneToOne(mappedBy = "Evento", fetch = FetchType.EAGER)
//	Perueiro perueiro;
//	
//	//Endereco aluno
//	@OneToOne(mappedBy = "Evento", fetch = FetchType.EAGER)
//	Aluno aluno;
//	
//	//Endereco escola
//	@OneToOne(mappedBy = "Evento", fetch = FetchType.EAGER)
//	Escola escola;
//
//	public int getIdItinerario() {
//		return idItinerario;
//	}
//
//	public void setIdItinerario(int idItinerario) {
//		this.idItinerario = idItinerario;
//	}
//
//	public Double getDistancia() {
//		return distancia;
//	}
//
//	public void setDistancia(Double distancia) {
//		this.distancia = distancia;
//	}
//
//	public int getIdPerueiro() {
//		return idPerueiro;
//	}
//
//	public void setIdPerueiro(int idPerueiro) {
//		this.idPerueiro = idPerueiro;
//	}
//
//	public int getIdAluno() {
//		return idAluno;
//	}
//
//	public void setIdAluno(int idAluno) {
//		this.idAluno = idAluno;
//	}
//
//	public int getIdEscola() {
//		return idEscola;
//	}
//
//	public void setIdEscola(int idEscola) {
//		this.idEscola = idEscola;
//	}
//
//	public Perueiro getPerueiro() {
//		return perueiro;
//	}
//
//	public void setPerueiro(Perueiro perueiro) {
//		this.perueiro = perueiro;
//	}
//
//	public Aluno getAluno() {
//		return aluno;
//	}
//
//	public void setAluno(Aluno aluno) {
//		this.aluno = aluno;
//	}
//
//	public Escola getEscola() {
//		return escola;
//	}
//
//	public void setEscola(Escola escola) {
//		this.escola = escola;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + idItinerario;
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
//		Itinerario other = (Itinerario) obj;
//		if (idItinerario != other.idItinerario)
//			return false;
//		return true;
//	}
//	
//	
//}
