package br.org.serratec.backend.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "REPRESENTANTE")
public class Representante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO_REPRESENTANTE")
	private String codigo;

	@Column(name = "RAZAOSOC_REPRESENTANTE")
	private String razaoSocial;

	@Column(name = "SENHA_REPRESENTANTE")
	private String senha;

	@JsonManagedReference
	@OneToMany
	private List<Cliente> cliente;

	public Representante() {

	}

	public Representante(String codigo, String razaoSocial, String senha, List<Cliente> cliente) {
		super();
		this.codigo = codigo;
		this.razaoSocial = razaoSocial;
		this.senha = senha;
		this.cliente = cliente;
	}

	public String getCodigo() {
		return codigo;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	@Override
	public String toString() {
		return "Representante [codigo=" + codigo + ", razaoSocial=" + razaoSocial + ", senha=" + senha + ", cliente="
				+ cliente + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Representante other = (Representante) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

}
