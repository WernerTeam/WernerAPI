package br.org.serratec.backend.DTO;

import java.util.Date;

import br.org.serratec.backend.model.CorDesenvolvimento;
import br.org.serratec.backend.model.CorSolic;

public class CorDesenvolvimentoDTO {
	private CorSolic codigoCor;
	private Long codigoArtigo;
	private Date dataPedidoCorCart;
	
		public CorDesenvolvimentoDTO(CorDesenvolvimento corDesenvolvimento) {
		super();
		this.codigoCor = corDesenvolvimento.getCodigoCor();
		this.codigoArtigo = corDesenvolvimento.getCodigoArtigo();
		this.dataPedidoCorCart = corDesenvolvimento.getDataPedidoCorCart();
	}

		
		public CorDesenvolvimentoDTO() {
			// TODO Auto-generated constructor stub
		}


		public CorSolic getCodigoCor() {
			return codigoCor;
		}


		public void setCodigoCor(CorSolic codigoCor) {
			this.codigoCor = codigoCor;
		}


		public Long getCodigoArtigo() {
			return codigoArtigo;
		}


		public void setCodigoArtigo(Long codigoArtigo) {
			this.codigoArtigo = codigoArtigo;
		}


		public Date getDataPedidoCorCart() {
			return dataPedidoCorCart;
		}


		public void setDataPedidoCorCart(Date dataPedidosCorCart) {
			this.dataPedidoCorCart = dataPedidosCorCart;
		}

		
}
