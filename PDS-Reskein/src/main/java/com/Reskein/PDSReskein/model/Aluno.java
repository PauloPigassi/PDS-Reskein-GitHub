package com.Reskein.PDSReskein.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;
import org.hibernate.validator.constraints.NotBlank;


@Entity
@Table(name = "Aluno")
public class Aluno {	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int idAluno;
		@NotBlank(message = "Endereco obrigatório")
		private String endereco;
		@NotBlank(message = "Contato obrigatório")
		private String contato;
		public int getIdAluno() {
			return idAluno;
		}
		public void setIdAluno(int idAluno) {
			this.idAluno = idAluno;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getContato() {
			return contato;
		}
		public void setContato(String contato) {
			this.contato = contato;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + idAluno;
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
			Aluno other = (Aluno) obj;
			if (idAluno != other.idAluno)
				return false;
			return true;
		}
		
		
		
		
}
