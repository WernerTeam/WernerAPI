package br.org.serratec.backend.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.backend.DTO.PedidoVendaDTO;
import br.org.serratec.backend.service.PedidoVendaService;

@RestController
@RequestMapping("api/auth/pedidosvenda")
public class PedidoVendaController {

	@Autowired
	PedidoVendaService pedidoVendaService;
	
	@GetMapping
	public ResponseEntity<List<PedidoVendaDTO>> listar(){
		return ResponseEntity.ok(pedidoVendaService.listar());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<PedidoVendaDTO> buscar (@PathVariable Long id){
		return ResponseEntity.ok(pedidoVendaService.buscar(id));
	}
	
	@GetMapping ("/clientevendas")
	public ResponseEntity<List<PedidoVendaDTO>> buscarCliente (@RequestParam (value = "cliente") String cliente){
		return ResponseEntity.ok(pedidoVendaService.buscarCliente(cliente));
	}
	
	@GetMapping ("/datasvenda")
	public ResponseEntity<List<PedidoVendaDTO>> buscarDataVenda (@RequestParam  Date dataPedido ) {
		return ResponseEntity.ok(pedidoVendaService.buscarDataPedido(dataPedido));
	}
	
	@GetMapping ("/datasentrega")
	public ResponseEntity<List<PedidoVendaDTO>> buscarDataEntrega (@RequestParam  Date dataEntrega){
		return ResponseEntity.ok(pedidoVendaService.buscarDataEntrega(dataEntrega));
		
	}
	
}
