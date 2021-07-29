package br.org.serratec.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.backend.DTO.ItemPedidoVendaDTO;
import br.org.serratec.backend.service.ItemPedidoVendaService;

@RestController
@RequestMapping("/pedidoVenda")
public class ItemPedidoVendaController {
	
	@Autowired
	ItemPedidoVendaService itemPedidoVendaService;
	
	@GetMapping
	public ResponseEntity<List<ItemPedidoVendaDTO>> listar (){
		return ResponseEntity.ok(itemPedidoVendaService.listar());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ItemPedidoVendaDTO> buscar (@PathVariable Long id){
		return ResponseEntity.ok(itemPedidoVendaService.buscar(id));
	}

}
