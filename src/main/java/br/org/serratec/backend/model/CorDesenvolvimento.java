package br.org.serratec.backend.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name= "ARTIGOSCORSOLICART") //"ARTIGOS"
public class CorDesenvolvimento {

	@JsonBackReference
	@OneToOne
	@JoinColumn(name = "CODCOR_ARTIGOSCORSOLIC")
	private CorSolic codigoCor;
	
	@Id
	@Column(name = "CODIGO_ARTIGO")
	private long codigoArtigo;

	@Column(name = "DTENVICLI_ARTIGOSCORSOLICART")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date dataPedidoCorCart;

	public CorDesenvolvimento(CorSolic codigoCor, long codigoArtigo, Date dataPedidoCorCart) {
		super();
		this.codigoCor = codigoCor;
		this.codigoArtigo = codigoArtigo;
		this.dataPedidoCorCart = dataPedidoCorCart;
	}

	
	public CorDesenvolvimento() {
		// TODO Auto-generated constructor stub
	}


	public CorSolic getCodigoCor() {
		return codigoCor;
	}


	public void setCodigoCor(CorSolic codigoCor) {
		this.codigoCor = codigoCor;
	}


	public long getCodigoArtigo() {
		return codigoArtigo;
	}


	public void setCodigoArtigo(long codigoArtigo) {
		this.codigoArtigo = codigoArtigo;
	}


	public Date getDataPedidoCorCart() {
		return dataPedidoCorCart;
	}


	public void setDataPedidoCorCart(Date dataPedidoCorCart) {
		this.dataPedidoCorCart = dataPedidoCorCart;
	}
	
	
}
