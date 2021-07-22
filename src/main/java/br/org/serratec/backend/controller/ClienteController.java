package br.org.serratec.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.backend.DTO.ClienteDTO;
import br.org.serratec.backend.service.ClienteService;

@RestController
@RequestMapping ("/clientes")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<ClienteDTO>> listar(){
		return ResponseEntity.ok(clienteService.listar());
	}
	
	//Teste Git de novo

}
