package br.org.serratec.backend.DTO;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.org.serratec.backend.model.Estampado;

public class EstampadoDTO {
	private Long codigoEstampado;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
	private Date dataPedido;
	
	public EstampadoDTO() {
		// TODO Auto-generated constructor stub
	}

	public EstampadoDTO(Estampado estampado) {
		super();
		this.codigoEstampado = estampado.getCodigoEstampado();
		this.dataPedido = estampado.getDataPedido();
	}

	public Long getCodigoEstampado() {
		return codigoEstampado;
	}

	public void setCodigoEstampado(Long codigoEstampado) {
		this.codigoEstampado = codigoEstampado;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	
	
	
	

}
