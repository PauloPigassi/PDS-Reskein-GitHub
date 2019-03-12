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
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import org.hibernate.validator.constraints.NotBlank;
//import org.springframework.data.annotation.Id;
//
//
//@Entity
//@Table(name = "Evento")
//public class Evento {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int idEvento;
//	@NotBlank(message = "Dia da semana obrigatório")
//	private String diaSemana;
//	@NotBlank(message = "Id Itinerario obrigatório")
//	private int idItinerario;
//	@NotBlank(message = "Periodo obrigatório")
//	private String periodo;
//	@NotBlank(message = "Id Turno obrigatório")
//	private int idTurno;
//	
////	Lista de alunos em eventos
//	@ManyToOne
//	@JoinColumn(name = "Aluno")
//	private List<Aluno> alunos;
//	
//	//Objeto itinerario, chave estrangeira
//	@OneToOne(mappedBy = "Evento", fetch = FetchType.EAGER)
//	private Itinerario itinerario;
//	
//	
//	
//	
//	public int getIdEvento() {
//		return idEvento;
//	}
//	public void setIdEvento(int idEvento) {
//		this.idEvento = idEvento;
//	}
//	public String getDiaSemana() {
//		return diaSemana;
//	}
//	public void setDiaSemana(String diaSemana) {
//		this.diaSemana = diaSemana;
//	}
//	public int getIdItinerario() {
//		return idItinerario;
//	}
//	public void setIdItinerario(int idItinerario) {
//		this.idItinerario = idItinerario;
//	}
//	public String getPeriodo() {
//		return periodo;
//	}
//	public void setPeriodo(String periodo) {
//		this.periodo = periodo;
//	}
//	public int getIdTurno() {
//		return idTurno;
//	}
//	public void setIdTurno(int idTurno) {
//		this.idTurno = idTurno;
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + idEvento;
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
//		Evento other = (Evento) obj;
//		if (idEvento != other.idEvento)
//			return false;
//		return true;
//	}
//	
//	
//	
//	
//}
