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

import br.org.serratec.backend.DTO.CorDesenvolvimentoDTO;
import br.org.serratec.backend.service.CorDesenvolvimentoService;

@RestController
@RequestMapping("api/auth/coresDesenvolvimento")
public class CorDesenvolvimentoController {

	@Autowired
	CorDesenvolvimentoService corDesenvolvimentoService;
	
	@GetMapping
	public ResponseEntity<List<CorDesenvolvimentoDTO>> listar(){
		return ResponseEntity.ok(corDesenvolvimentoService.listar());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<CorDesenvolvimentoDTO> buscarCodigo (@PathVariable Long id){
		return ResponseEntity.ok(corDesenvolvimentoService.buscarCodigo(id));
	}
	
	@GetMapping ("/data")
	public ResponseEntity<List<CorDesenvolvimentoDTO>> buscarDate (@RequestParam (name  = "data") Date dataPedidoCorCart){
		return ResponseEntity.ok(corDesenvolvimentoService.buscarData(dataPedidoCorCart));
	}
}
