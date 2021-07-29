package br.org.serratec.backend.DTO;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.org.serratec.backend.model.Cliente;
import br.org.serratec.backend.model.PedidoVenda;


public class PedidoVendaDTO {
	private Long numeroPedido;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date dataPedido;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date dataEntrega;
	
	private Cliente cliente;
	
	
	public PedidoVendaDTO() {
		// TODO Auto-generated constructor stub
	}


	public PedidoVendaDTO(PedidoVenda pedidoVenda) {
		super();
		this.numeroPedido = pedidoVenda.getNumeroPedido();
		this.dataPedido = pedidoVenda.getDataPedido();
		this.dataEntrega = pedidoVenda.getDataEntrega();
		this.cliente = pedidoVenda.getCliente();
	}


	public Long getNumeroPedido() {
		return numeroPedido;
	}


	public void setNumeroPedido(Long numeroPedido) {
		this.numeroPedido = numeroPedido;
	}


	public Date getDataPedido() {
		return dataPedido;
	}


	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}


	public Date getDataEntrega() {
		return dataEntrega;
	}


	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
	
	
	
	
}
