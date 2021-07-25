package br.org.serratec.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import br.org.serratec.backend.enums.StatusPedItem;

@Entity
@Table(name = "ESTAMPDESENHOSPEDIDOSITENS")
public class PedidoItensEstampado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ESTDESPEDITE")
	private long codigoPedidoItemEstam;
	
	@Column(name = "CODIGO_ARTIGO")
	private long CodArtigo;

	@Column(name = "CODIGO_DESENHO")
	private long CodDesenho;
	
	@Column(name = "CODIGO_VARIANTE")
	private String codVariante;
	
	@Column(name = "STATUS_ESTDESPEDITE")
	private StatusPedItem statuspeditem;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "CODIGO_ESTDESPED")
	private PedidoDesenvolvimentoEstampado pedidoDesenvolvimentoEstampado;
	
	public PedidoItensEstampado() {
	
	}

	public PedidoItensEstampado(long codigoPedidoItemEstam, long codArtigo, long codDesenho, String codVariante,
			StatusPedItem statuspeditem, PedidoDesenvolvimentoEstampado pedidoDesenvolvimentoEstampado) {
		super();
		this.codigoPedidoItemEstam = codigoPedidoItemEstam;
		CodArtigo = codArtigo;
		CodDesenho = codDesenho;
		this.codVariante = codVariante;
		this.statuspeditem = statuspeditem;
		this.pedidoDesenvolvimentoEstampado = pedidoDesenvolvimentoEstampado;
	}

	public long getCodigoPedidoItemEstam() {
		return codigoPedidoItemEstam;
	}

	public void setCodigoPedidoItemEstam(long codigoPedidoItemEstam) {
		this.codigoPedidoItemEstam = codigoPedidoItemEstam;
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

	public PedidoDesenvolvimentoEstampado getPedidoDesenvolvimentoEstampado() {
		return pedidoDesenvolvimentoEstampado;
	}

	public void setPedidoDesenvolvimentoEstampado(PedidoDesenvolvimentoEstampado pedidoDesenvolvimentoEstampado) {
		this.pedidoDesenvolvimentoEstampado = pedidoDesenvolvimentoEstampado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codigoPedidoItemEstam ^ (codigoPedidoItemEstam >>> 32));
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
		PedidoItensEstampado other = (PedidoItensEstampado) obj;
		if (codigoPedidoItemEstam != other.codigoPedidoItemEstam)
			return false;
		return true;
	}

	
	
	
	
	
}
