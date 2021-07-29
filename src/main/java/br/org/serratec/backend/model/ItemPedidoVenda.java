package br.org.serratec.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "ITEMPEDIDOVENDA")
public class ItemPedidoVenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NUMERO_PEDIDO")
	private Long idPedido;
	
	
	@Column (name = "QUANTPEDIDO_ITEMPED")
	private Long quantidadeMetro;	
	
	@JsonBackReference
	@OneToOne
	@JoinColumn (name = "ID_ARTCOLCORFUN")
	private ArtigoFun idArtigoCorFun;
	
	public ItemPedidoVenda() {
		// TODO Auto-generated constructor stub
	}

	public ItemPedidoVenda(Long idPedido, Long quantidadeMetro) {
		super();
		this.idPedido = idPedido;
		this.quantidadeMetro = quantidadeMetro;
	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Long getQuantidadeMetro() {
		return quantidadeMetro;
	}

	public void setQuantidadeMetro(Long quantidadeMetro) {
		this.quantidadeMetro = quantidadeMetro;
	}
	


	public ArtigoFun getIdArtigoCorFun() {
		return idArtigoCorFun;
	}

	public void setIdArtigoCorFun(ArtigoFun idArtigoCorFun) {
		this.idArtigoCorFun = idArtigoCorFun;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPedido == null) ? 0 : idPedido.hashCode());
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
		ItemPedidoVenda other = (ItemPedidoVenda) obj;
		if (idPedido == null) {
			if (other.idPedido != null)
				return false;
		} else if (!idPedido.equals(other.idPedido))
			return false;
		return true;
	}




	
	
	
	

}