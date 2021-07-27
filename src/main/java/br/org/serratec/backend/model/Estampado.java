package br.org.serratec.backend.model;

import java.util.Date;
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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;


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
	
	@JsonManagedReference
	@OneToMany
	private List<EstampadoItem> estampadoItem;
	
	public Estampado() {
		// TODO Auto-generated constructor stub
	}


public Estampado(long codigoEstampado, Date dataPedido) {
	super();
	this.codigoEstampado = codigoEstampado;
	this.dataPedido = dataPedido;
}



public List<EstampadoItem> getEstampadoItem() {
	return estampadoItem;
}


public void setEstampadoItem(List<EstampadoItem> estampadoItem) {
	this.estampadoItem = estampadoItem;
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
