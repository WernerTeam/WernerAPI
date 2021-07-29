package br.org.serratec.backend.DTO;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.org.serratec.backend.model.Cliente;
import br.org.serratec.backend.model.CorDesenvolvida;

public class CorDesenvolvidaDTO {
	private String descricao;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
	private Date dataPedidoCorArt;
	private String codigoCor;
	private Cliente cliente;
	
	public CorDesenvolvidaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CorDesenvolvidaDTO(CorDesenvolvida corDesenvolvida) {
		super();
		this.descricao = corDesenvolvida.getDescricao();
		this.dataPedidoCorArt = corDesenvolvida.getDataPedidoCorArt();
		this.codigoCor = corDesenvolvida.getCodigoCorArt();
		this.cliente = corDesenvolvida.getCliente();
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
	public String getCodigoCor() {
		return codigoCor;
	}
	public void setCodigoCor(String codigoCor) {
		this.codigoCor = codigoCor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	

	
}
