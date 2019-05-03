package com.Reskein.PDSReskein.model;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.Id;


@Entity
@Table(name = "Viagem")
public class Viagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idViagem;
	@NotBlank(message = "Id Itinerario obrigatório")
	private int idItinerario;
	@NotBlank(message = "Id Turno obrigatório")
	private int idTurno;
	@NotBlank(message = "Dia da semana obrigatório")
	private String diaSemana;	
	@NotBlank(message = "Periodo obrigatório")
	private String periodo;
	
	
//	Lista de alunos em viagens
//	@ManyToOne
//	@JoinColumn(name = "Aluno")
//	private List<Aluno> alunos;
//	
//	//Objeto itinerario, chave estrangeira
//	@OneToOne(mappedBy = "Viagem", fetch = FetchType.EAGER)
//	private Itinerario itinerario;
	
	
	
	
	public int getIdViagem() {
		return idViagem;
	}
	public void setIdViagem(int idViagem) {
		this.idViagem = idViagem;
	}
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public int getIdItinerario() {
		return idItinerario;
	}
	public void setIdItinerario(int idItinerario) {
		this.idItinerario = idItinerario;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public int getIdTurno() {
		return idTurno;
	}
	public void setIdTurno(int idTurno) {
		this.idTurno = idTurno;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idViagem;
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
		Viagem other = (Viagem) obj;
		if (idViagem != other.idViagem)
			return false;
		return true;
	}
	
	
	
	
}