package br.org.serratec.backend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "ARTIGOSCORSOLIC")
 public class CorSolic {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODCOR_ARTIGOSCORSOLIC")
	private Long codigoCor;

	@Column(name = "DTSOLIC_ARTIGOSCORSOLIC")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date dataPedidoCor;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "CODIGO_CLIENTE")
	private Cliente cliente;
	
	@JsonManagedReference
	private CorDesenvolvimento corDesenvolvimento;
	
	public CorDesenvolvimento getCorDesenvolvimento() {
		return corDesenvolvimento;
	}

	public void setCorDesenvolvimento(CorDesenvolvimento corDesenvolvimento) {
		this.corDesenvolvimento = corDesenvolvimento;
	}

	public void setCodigoCor(Long codigoCor) {
		this.codigoCor = codigoCor;
	}

	public CorSolic() {
		
	}

	public CorSolic(long codigoCor, Date dataPedidoCor, Cliente cliente) {
		super();
		this.codigoCor = codigoCor;
		this.dataPedidoCor = dataPedidoCor;
		this.cliente = cliente;
	}

	public long getCodigoCor() {
		return codigoCor;
	}

	public void setCodigoCor(long codigoCor) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
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
		CorSolic other = (CorSolic) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		return true;
	}
	
	
}
