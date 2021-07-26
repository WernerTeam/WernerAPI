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

import br.org.serratec.backend.DTO.EstampadoDTO;
import br.org.serratec.backend.service.EstampadoService;

@RestController
@RequestMapping("api/auth/estampados")
public class EstampadoController {
	
	@Autowired
	EstampadoService estampadoService;
	
	@GetMapping
	public ResponseEntity<List<EstampadoDTO>> listar(){
		return ResponseEntity.ok(estampadoService.listar());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<EstampadoDTO> buscar (@PathVariable Long id){
		return ResponseEntity.ok(estampadoService.buscar(id));
	}
	
	@GetMapping ("/cliente")
	public ResponseEntity<List<EstampadoDTO>> buscarCliente (@RequestParam (value = "cliente") String cliente){
		return ResponseEntity.ok(estampadoService.buscarCliente(cliente));
	}
	
	@GetMapping ("/dataInicial")
	public ResponseEntity<List<EstampadoDTO>> buscarDataInicial (@RequestParam (value = "dataInicial") Date dataPedido ) {
		return ResponseEntity.ok(estampadoService.buscarDataInicial(dataPedido));
	}
	
	@GetMapping ("/dataFinal")
	public ResponseEntity<List<EstampadoDTO>> buscarDataFinal (@RequestParam (value = "dataFinal") Date dataPedido){
		return ResponseEntity.ok(estampadoService.buscarDataFinal(dataPedido));
		
	}
}
