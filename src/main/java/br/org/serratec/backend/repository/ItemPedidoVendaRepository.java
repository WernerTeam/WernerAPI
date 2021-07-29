package br.org.serratec.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.backend.DTO.ItemPedidoVendaDTO;
import br.org.serratec.backend.model.ItemPedidoVenda;

public interface ItemPedidoVendaRepository extends JpaRepository<ItemPedidoVenda, Long> {
		
	public ItemPedidoVendaDTO findByIdPedido (Long idPedido);

}
