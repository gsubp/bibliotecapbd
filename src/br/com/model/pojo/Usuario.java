package br.com.model.pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {
	private Long id;
	private int matricula;
	private String cpf;
	private String nome;
	private String endereco;
	private String email;
	private String situacao;
	private boolean isProfessor;
	private List<Telefone> telefones;
	
	
	public Usuario() {
		super();
	}

	public Usuario(Long id, int matricula, String cpf, String nome, String endereco, String email, String situacao,
			boolean isProfessor) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.situacao = situacao;
		this.isProfessor = isProfessor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public boolean isProfessor() {
		return isProfessor;
	}

	public void setProfessor(boolean isProfessor) {
		this.isProfessor = isProfessor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", matricula=" + matricula + ", cpf=" + cpf + ", nome=" + nome + ", endereco="
				+ endereco + ", email=" + email + ", situacao=" + situacao + ", isProfessor=" + isProfessor + "]";
	}
	
	
	
}
