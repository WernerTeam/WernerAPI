package br.org.serratec.backend.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table (name = "CLIENTE")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "CODIGO_CLIENTE")
	private long codigoCliente;
	
	@Column (name = "RAZAOSOC_CLIENTE")
	private String razaoSocialCliente;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn (name = "CODIGO_REPRESENTANTE1")
	private Representante representante;
	
	@JsonManagedReference
	@OneToMany
	private List<Estampado> estampados;
	
	@JsonManagedReference
	private List<CorSolic> corSolic;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	public Cliente(long codigoCliente, String razaoSocialCliente, Representante representante,
			List<Estampado> estampados, List<CorSolic> corSolic) {
		super();
		this.codigoCliente = codigoCliente;
		this.razaoSocialCliente = razaoSocialCliente;
		this.representante = representante;
		this.estampados = estampados;
		this.corSolic = corSolic;
	}
	public List<CorSolic> getCorSolic() {
		return corSolic;
	}
	public void setCorSolic(List<CorSolic> corSolic) {
		this.corSolic = corSolic;
	}
	public List<Estampado> getEstampados() {
		return estampados;
	}
	public void setEstampados(List<Estampado> estampados) {
		this.estampados = estampados;
	}
	public long getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getRazaoSocialCliente() {
		return razaoSocialCliente;
	}

	public void setRazaoSocialCliente(String razaoSocialCliente) {
		this.razaoSocialCliente = razaoSocialCliente;
	}

	public Representante getRepresentante() {
		return representante;
	}

	public void setRepresentante(Representante representante) {
		this.representante = representante;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codigoCliente ^ (codigoCliente >>> 32));
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
		Cliente other = (Cliente) obj;
		if (codigoCliente != other.codigoCliente)
			return false;
		return true;
	}
	
		
	

}
