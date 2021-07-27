package br.org.serratec.backend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "ESTAMPDESENHOSPEDIDOS")
public class Estampado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO_ESTDESPED")
	private long codigoEstampado;

	@Column(name = "DATA_ESTDESPED")
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
	private Date dataPedido;

		
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "CODIGO_CLIENTE")
	private Cliente cliente;
	
	public Estampado() {
		// TODO Auto-generated constructor stub
	}


public Estampado(long codigoEstampado, Date dataPedido) {
	super();
	this.codigoEstampado = codigoEstampado;
	this.dataPedido = dataPedido;
}


public long getCodigoEstampado() {
	return codigoEstampado;
}


public void setCodigoEstampado(long codigoEstampado) {
	this.codigoEstampado = codigoEstampado;
}


public Date getDataPedido() {
	return dataPedido;
}


public void setDataPedido(Date dataPedido) {
	this.dataPedido = dataPedido;
}

public Cliente getCliente() {
	return cliente;
}

public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}	
	

}
