package br.org.serratec.backend.DTO;

import java.util.Date;

import br.org.serratec.backend.model.Cliente;
import br.org.serratec.backend.model.CorSolic;

public class CorSolicDTO {
	
	private Long codigoCor;
	private Date dataPedidoCor;
	private Cliente cliente;
	
	public CorSolicDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public CorSolicDTO(CorSolic corSolic) {
		super();
		this.codigoCor = corSolic.getCodigoCor();
		this.dataPedidoCor = corSolic.getDataPedidoCor();
		this.cliente = corSolic.getCliente();
	}
	public Long getCodigoCor() {
		return codigoCor;
	}
	public void setCodigoCor(Long codigoCor) {
		this.codigoCor = codigoCor;
	}
	public Date getDataPedidoCor() {
		return dataPedidoCor;
	}
	public void setDataPedidoCor(Date dataPedidoCor) {
		this.dataPedidoCor = dataPedidoCor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	

}
