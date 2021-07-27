package br.org.serratec.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.backend.DTO.CorDesenvolvimentoDTO;
import br.org.serratec.backend.service.CorDesenvolvimentoService;

@RestController
@RequestMapping("/cor-desenvolvimento")
public class CorDesenvolvimentoController {

	@Autowired
	CorDesenvolvimentoService corDesenvolvimentoService;
	
	@GetMapping
	public ResponseEntity<List<CorDesenvolvimentoDTO>> listar(){
		return ResponseEntity.ok(corDesenvolvimentoService.listar());
	}
}
