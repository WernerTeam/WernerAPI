package br.org.serratec.backend.model;

import java.time.LocalDate;
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
@Table(name = "ESTAMPDESENHOSPEDIDOS")
public class PedidoDesenvolvimentoEstampado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO_ESTDESPED")
	private long codigoEstampado;

	@Column(name = "DATAESTDESPED")
	//@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
	private LocalDate dataPedido;

	@JsonBackReference
	@OneToMany
	@JoinColumn(name = "CODIGO_CLIENTE")
	private Cliente cliente;

	public PedidoDesenvolvimentoEstampado(long codigoEstampado, LocalDate dataPedido, Cliente cliente) {
		super();
		this.codigoEstampado = codigoEstampado;
		this.dataPedido = dataPedido;
		this.cliente = cliente;
	}

	public PedidoDesenvolvimentoEstampado() {
	}

	public long getCodigoEstampado() {
		return codigoEstampado;
	}

	public void setCodigoEstampado(long codigoEstampado) {
		this.codigoEstampado = codigoEstampado;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codigoEstampado ^ (codigoEstampado >>> 32));
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
		PedidoDesenvolvimentoEstampado other = (PedidoDesenvolvimentoEstampado) obj;
		if (codigoEstampado != other.codigoEstampado)
			return false;
		return true;
	}
	
	

}
