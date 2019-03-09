package com.Reskein.PDSReskein.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "Turno")
public class Turno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTurno;
	@NotBlank(message = "Horario entrada obrigatório")
	private Date horarioEntrada;
	@NotBlank(message = "Horario saida obrigatório")
	private Date horarioSaida;
	public int getIdTurno() {
		return idTurno;
	}
	public void setIdTurno(int idTurno) {
		this.idTurno = idTurno;
	}
	public Date getHorarioEntrada() {
		return horarioEntrada;
	}
	public void setHorarioEntrada(Date horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}
	public Date getHorarioSaida() {
		return horarioSaida;
	}
	public void setHorarioSaida(Date horarioSaida) {
		this.horarioSaida = horarioSaida;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idTurno;
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
		Turno other = (Turno) obj;
		if (idTurno != other.idTurno)
			return false;
		return true;
	}	
	
	
}
