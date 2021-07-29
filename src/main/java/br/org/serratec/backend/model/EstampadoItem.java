package br.org.serratec.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import br.org.serratec.backend.enums.Status;

@Entity
@Table(name = "ESTAMPDESENHOSPEDIDOSITENS")
public class EstampadoItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ESTDESPEDITE")
	private Long idEstampadoItem;
	
	@Column(name="CODIGO_ARTIGO")
	private String codigoArtigo;
	
	@Column (name= "CODIGO_DESENHO")
	private Long codigoDesenho;
	
	@Column (name= "CODIGO_VARIANTE")
	private Long codigoVariante;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "CODIGO_ESTDESPED")
	private Estampado codigoEstampado;
	
	
	@Column (name = "STATUS_ESTDESPEDITE")
	private Status status;
	
	@JsonManagedReference
	@OneToOne
	private ArtigoFun artigoFun;


	public EstampadoItem(Long idEstampadoItem, String codigoArtigo, Long codigoDesenho, Long codigoVariante,
			Estampado codigoEstampado, Status status) {
		super();
		this.idEstampadoItem = idEstampadoItem;
		this.codigoArtigo = codigoArtigo;
		this.codigoDesenho = codigoDesenho;
		this.codigoVariante = codigoVariante;
		this.codigoEstampado = codigoEstampado;
		this.status = status;
	}
	
	public EstampadoItem() {
		// TODO Auto-generated constructor stub
	}


	public Long getIdEstampadoItem() {
		return idEstampadoItem;
	}


	public void setIdEstampadoItem(Long idEstampadoItem) {
		this.idEstampadoItem = idEstampadoItem;
	}


	public String getCodigoArtigo() {
		return codigoArtigo;
	}


	public void setCodigoArtigo(String codigoArtigo) {
		this.codigoArtigo = codigoArtigo;
	}


	public Long getCodigoDesenho() {
		return codigoDesenho;
	}


	public void setCodigoDesenho(Long codigoDesenho) {
		this.codigoDesenho = codigoDesenho;
	}


	public Long getCodigoVariante() {
		return codigoVariante;
	}


	public void setCodigoVariante(Long codigoVariante) {
		this.codigoVariante = codigoVariante;
	}


	public Estampado getCodigoEstampado() {
		return codigoEstampado;
	}


	public void setCodigoEstampado(Estampado codigoEstampado) {
		this.codigoEstampado = codigoEstampado;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEstampadoItem == null) ? 0 : idEstampadoItem.hashCode());
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
		EstampadoItem other = (EstampadoItem) obj;
		if (idEstampadoItem == null) {
			if (other.idEstampadoItem != null)
				return false;
		} else if (!idEstampadoItem.equals(other.idEstampadoItem))
			return false;
		return true;
	}
	
	
	
	
	
	 

}
