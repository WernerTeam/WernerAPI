package br.org.serratec.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "ARTIGOSCOLCORFUN")
public class ArtigoFun {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ARTCOLCORFUN")
	private Long idArtigoFun;
	
	@JsonBackReference
	@JoinColumn(name = "CODIGO_ARTIGO")
	private EstampadoItem codigoArtigo;
	
	@JsonBackReference
	@JoinColumn(name  = "CODIGO_DESENHO")
	private EstampadoItem codigoDesenho;
	
	@JsonBackReference
	@JoinColumn(name  = "CODIGO_VARIANTE")
	private EstampadoItem codigoCor;
	
	@JsonManagedReference
	private ItemPedidoVenda itemPedidoVenda;
	
	public ArtigoFun() {
		// TODO Auto-generated constructor stub
	}

	public ArtigoFun(Long idArtigoFun, EstampadoItem codigoArtigo, EstampadoItem codigoDesenho, EstampadoItem codigoCor,
			ItemPedidoVenda itemPedidoVenda) {
		super();
		this.idArtigoFun = idArtigoFun;
		this.codigoArtigo = codigoArtigo;
		this.codigoDesenho = codigoDesenho;
		this.codigoCor = codigoCor;
		this.itemPedidoVenda = itemPedidoVenda;
	}

	public Long getIdArtigoFun() {
		return idArtigoFun;
	}

	public void setIdArtigoFun(Long idArtigoFun) {
		this.idArtigoFun = idArtigoFun;
	}

	public EstampadoItem getCodigoArtigo() {
		return codigoArtigo;
	}

	public void setCodigoArtigo(EstampadoItem codigoArtigo) {
		this.codigoArtigo = codigoArtigo;
	}

	public EstampadoItem getCodigoDesenho() {
		return codigoDesenho;
	}

	public void setCodigoDesenho(EstampadoItem codigoDesenho) {
		this.codigoDesenho = codigoDesenho;
	}

	public EstampadoItem getCodigoCor() {
		return codigoCor;
	}

	public void setCodigoCor(EstampadoItem codigoCor) {
		this.codigoCor = codigoCor;
	}

	public ItemPedidoVenda getItemPedidoVenda() {
		return itemPedidoVenda;
	}

	public void setItemPedidoVenda(ItemPedidoVenda itemPedidoVenda) {
		this.itemPedidoVenda = itemPedidoVenda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idArtigoFun == null) ? 0 : idArtigoFun.hashCode());
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
		ArtigoFun other = (ArtigoFun) obj;
		if (idArtigoFun == null) {
			if (other.idArtigoFun != null)
				return false;
		} else if (!idArtigoFun.equals(other.idArtigoFun))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	

}
