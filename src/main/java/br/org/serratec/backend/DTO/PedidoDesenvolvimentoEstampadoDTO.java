package br.org.serratec.backend.DTO;

import java.util.Date;

import br.org.serratec.backend.enums.StatusPedItem;
import br.org.serratec.backend.model.PedidoDesenvolvimentoEstampado;

public class PedidoDesenvolvimentoEstampadoDTO {
	private long codigoEstampado;
	private Date dataPedido;
	private long CodArtigo;
	private long CodDesenho;
	private String codVariante;
	private StatusPedItem statuspeditem;
	
	public PedidoDesenvolvimentoEstampadoDTO(PedidoDesenvolvimentoEstampado pe) {
		super();
		this.codigoEstampado = pe.getCodigoEstampado();
		this.dataPedido = pe.getDataPedido();
		CodArtigo = pe.getCodArtigo();
		CodDesenho = pe.getCodDesenho();
		this.codVariante = pe.getCodVariante();
		this.statuspeditem = pe.getStatuspeditem();
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

	public long getCodArtigo() {
		return CodArtigo;
	}

	public void setCodArtigo(long codArtigo) {
		CodArtigo = codArtigo;
	}

	public long getCodDesenho() {
		return CodDesenho;
	}

	public void setCodDesenho(long codDesenho) {
		CodDesenho = codDesenho;
	}

	public String getCodVariante() {
		return codVariante;
	}

	public void setCodVariante(String codVariante) {
		this.codVariante = codVariante;
	}

	public StatusPedItem getStatuspeditem() {
		return statuspeditem;
	}

	public void setStatuspeditem(StatusPedItem statuspeditem) {
		this.statuspeditem = statuspeditem;
	}
	
	
	
	
}
