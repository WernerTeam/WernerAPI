package br.org.serratec.backend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "ARTIGOSCORES")
public class CorDesenvolvida {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO_COR")
	private String codigoCorArt;
	
	@Column(name = "DESCRICAO_COR")
	private String descricao;

	@Column(name = "DTCOR_ARTIGOSCORES")
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
	private Date dataPedidoCorArt;

	@JsonBackReference
	@OneToMany
	@JoinColumn(name = "CODIGO_CLIENTE")
	private Cliente cliente;

	public CorDesenvolvida(String codigoCorArt, String descricao, Date dataPedidoCorArt, Cliente cliente) {
		super();
		this.codigoCorArt = codigoCorArt;
		this.descricao = descricao;
		this.dataPedidoCorArt = dataPedidoCorArt;
		this.cliente = cliente;
	}

	public String getCodigoCorArt() {
		return codigoCorArt;
	}

	public void setCodigoCorArt(String codigoCorArt) {
		this.codigoCorArt = codigoCorArt;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataPedidoCorArt() {
		return dataPedidoCorArt;
	}

	public void setDataPedidoCorArt(Date dataPedidoCorArt) {
		this.dataPedidoCorArt = dataPedidoCorArt;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	

	
	
	
	
}
