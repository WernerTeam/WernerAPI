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

import br.org.serratec.backend.DTO.CorSolicDTO;
import br.org.serratec.backend.service.CorSolicService;

@RestController
@RequestMapping ("api/auth/coressolicitadas")
public class CorSolicController {
	
	@Autowired
	CorSolicService corSolicService;
	
	@GetMapping
	public ResponseEntity<List<CorSolicDTO>> listar (){
		return ResponseEntity.ok(corSolicService.listar());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CorSolicDTO> buscar (@PathVariable Long id) {
		return ResponseEntity.ok(corSolicService.buscar(id));
	}
	
	@GetMapping("/cliente")
	public ResponseEntity<List<CorSolicDTO>> buscarCliente (@RequestParam (name = "cliente") String cliente){
		return ResponseEntity.ok(corSolicService.buscarCliente(cliente));
	}
	
	@GetMapping("/dataInicial")
	public ResponseEntity<List<CorSolicDTO>> buscarDataInicial (@RequestParam (name = "dataInicial") Date dataPedidoCor){
		return ResponseEntity.ok(corSolicService.buscarDataInicial(dataPedidoCor));
	}
	
	@GetMapping("/dataFinal")
	public ResponseEntity<List<CorSolicDTO>> buscarDataFinal (@RequestParam (name = "dataFinal") Date dataPedidoCor){
		return ResponseEntity.ok(corSolicService.buscarDataFinal(dataPedidoCor));
	}
}
