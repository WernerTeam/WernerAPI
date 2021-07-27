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

import br.org.serratec.backend.DTO.CorDesenvolvidaDTO;
import br.org.serratec.backend.service.CorDesenvolvidaService;

@RestController
@RequestMapping
public class CorDesenvolvidaController {
	
			
		@Autowired
		CorDesenvolvidaService corDesenvolvidaService;
		
		@GetMapping
		public ResponseEntity<List<CorDesenvolvidaDTO>> listar(){
			return ResponseEntity.ok(corDesenvolvidaService.listar());
		}
		
		//@GetMapping ("/{id}")
		//public ResponseEntity<CorDesenvolvidaDTO> buscar (@PathVariable Long id){
			//return ResponseEntity.ok(corDesenvolvidaService.buscar(id));
		//}
		
		@GetMapping ("/cliente")
		public ResponseEntity<List<CorDesenvolvidaDTO>> buscarCliente (@RequestParam (value = "cliente") String cliente){
			return ResponseEntity.ok(corDesenvolvidaService.buscarCliente(cliente));
		}
		
		@GetMapping ("/dataInicial")
		public ResponseEntity<List<CorDesenvolvidaDTO>> buscarDataInicial (@RequestParam (value = "dataInicial") Date dataPedido ) {
			return ResponseEntity.ok(corDesenvolvidaService.buscarDataInicial(dataPedido));
		}
		
		@GetMapping ("/dataFinal")
		public ResponseEntity<List<CorDesenvolvidaDTO>> buscarDataFinal (@RequestParam (value = "dataFinal") Date dataPedido){
			return ResponseEntity.ok(corDesenvolvidaService.buscarDataFinal(dataPedido));
			
		}
	}


