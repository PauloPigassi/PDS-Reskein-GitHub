//package com.Reskein.PDSReskein.model;
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
//@Table(name = "Perueiro")
//public class Perueiro {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int idPerueiro;
//	@NotBlank(message = "Login obrigatório")
//	private String login;
//	@NotBlank(message = "Senha obrigatória")
//	private String senha;
//	@NotBlank(message = "Endereço obrigatório")
//	private String endereco;
//	public int getIdPerueiro() {
//		return idPerueiro;
//	}
//	public void setIdPerueiro(int idPerueiro) {
//		this.idPerueiro = idPerueiro;
//	}
//	public String getLogin() {
//		return login;
//	}
//	public void setLogin(String login) {
//		this.login = login;
//	}
//	public String getSenha() {
//		return senha;
//	}
//	public void setSenha(String senha) {
//		this.senha = senha;
//	}
//	public String getEndereco() {
//		return endereco;
//	}
//	public void setEndereco(String endereco) {
//		this.endereco = endereco;
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + idPerueiro;
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
//		Perueiro other = (Perueiro) obj;
//		if (idPerueiro != other.idPerueiro)
//			return false;
//		return true;
//	}
//	
//	
//	
//}
