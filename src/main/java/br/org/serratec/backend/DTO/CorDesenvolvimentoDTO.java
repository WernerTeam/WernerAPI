package br.org.serratec.backend.DTO;

import java.util.Date;

import br.org.serratec.backend.model.CorDesenvolvimento;

public class CorDesenvolvimentoDTO {
	private long codigoCorCart;
	private long codigoArtigo;
	private Date dataPedidosCorCart;
	
	public CorDesenvolvimentoDTO(long codigoCorCart, long codigoArtigo, Date dataPedidosCorCart) {
		super();
		this.codigoCorCart = codigoCorCart;
		this.codigoArtigo = codigoArtigo;
		this.dataPedidosCorCart = dataPedidosCorCart;
	}


	public CorDesenvolvimentoDTO(CorDesenvolvimento corDesenvolvimento) {
		// TODO Auto-generated constructor stub
	}


	public long getCodigoCorCart() {
		return codigoCorCart;
	}

	public void setCodigoCorCart(long codigoCorCart) {
		this.codigoCorCart = codigoCorCart;
	}

	public long getCodigoArtigo() {
		return codigoArtigo;
	}

	public void setCodigoArtigo(long codigoArtigo) {
		this.codigoArtigo = codigoArtigo;
	}

	public Date getDataPedidosCorCart() {
		return dataPedidosCorCart;
	}

	public void setDataPedidosCorCart(Date dataPedidosCorCart) {
		this.dataPedidosCorCart = dataPedidosCorCart;
	}
	
}
