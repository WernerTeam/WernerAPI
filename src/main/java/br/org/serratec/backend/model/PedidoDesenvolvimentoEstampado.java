package br.org.serratec.backend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import br.org.serratec.backend.enums.StatusPedItem;

@Entity
@Table(name = "ESTAMPDESENHOSPEDIDOS")
@SecondaryTable(name = "ESTAMPDESENHOSPEDIDOSITENS")
public class PedidoDesenvolvimentoEstampado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO_ESTDESPED")
	private long codigoEstampado;

	@Column(name = "DATAESTDESPED")
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
	private Date dataPedido;

	@Column(table ="ESTAMPDESENHOSPEDIDOSITENS" , name = "CODIGO_ARTIGO")
	private long CodArtigo;

	@Column(table = "ESTAMPDESENHOSPEDIDOSITENS" , name = "CODIGO_DESENHO")
	private long CodDesenho;
	
	@Column(table = "ESTAMPDESENHOSPEDIDOSITENS", name = "CODIGO_VARIANTE")
	private String codVariante;
	
	@Column(table = "ESTAMPDESENHOSPEDIDOSITENS", name = "STATUS_ESTDESPEDITE")
	private StatusPedItem statuspeditem;
	
		
	@JsonBackReference
	@OneToMany
	@JoinColumn(name = "CODIGO_CLIENTE")
	private Cliente cliente;
	
	public PedidoDesenvolvimentoEstampado() {
		// TODO Auto-generated constructor stub
	}

	public PedidoDesenvolvimentoEstampado(long codigoEstampado, Date dataPedido, long codArtigo, long codDesenho,
			String codVariante, StatusPedItem statuspeditem, Cliente cliente) {
		super();
		this.codigoEstampado = codigoEstampado;
		this.dataPedido = dataPedido;
		CodArtigo = codArtigo;
		CodDesenho = codDesenho;
		this.codVariante = codVariante;
		this.statuspeditem = statuspeditem;
		this.cliente = cliente;
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
