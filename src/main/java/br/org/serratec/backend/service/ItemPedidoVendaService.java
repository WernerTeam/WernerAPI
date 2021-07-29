package br.org.serratec.backend.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.backend.DTO.ItemPedidoVendaDTO;
import br.org.serratec.backend.model.ItemPedidoVenda;
import br.org.serratec.backend.repository.ItemPedidoVendaRepository;

@Service
public class ItemPedidoVendaService {

	@Autowired
	ItemPedidoVendaRepository itemPedidoVendaRepository;
	
	public List<ItemPedidoVendaDTO> listar (){
		List<ItemPedidoVendaDTO> itensDTO = new ArrayList <ItemPedidoVendaDTO>();
		List<ItemPedidoVenda> itens = itemPedidoVendaRepository.findAll();
		for(ItemPedidoVenda item : itens) {
			ItemPedidoVendaDTO itemDTO = new ItemPedidoVendaDTO(item);
			itensDTO.add(itemDTO);
		}
		return itensDTO;
		
	}
	
	public ItemPedidoVendaDTO buscar (Long idPedido) {
		return itemPedidoVendaRepository.findByIdPedido(idPedido);
	}
	
}
