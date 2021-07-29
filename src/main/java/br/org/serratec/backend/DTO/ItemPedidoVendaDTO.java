package br.org.serratec.backend.DTO;

import br.org.serratec.backend.model.ItemPedidoVenda;

public class ItemPedidoVendaDTO {
	
	private Long idPedido;
	private Long quantidadeMetro;

	
	public ItemPedidoVendaDTO() {
		// TODO Auto-generated constructor stub
	}
	public ItemPedidoVendaDTO(ItemPedidoVenda itemPedido) {
		super();
		this.idPedido = itemPedido.getIdPedido();
		this.quantidadeMetro = itemPedido.getQuantidadeMetro();
		
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
	
	
	

}
