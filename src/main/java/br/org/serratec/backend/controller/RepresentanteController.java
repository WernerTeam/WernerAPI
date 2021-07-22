package br.org.serratec.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.backend.DTO.RepresentanteDTO;
import br.org.serratec.backend.service.RepresentanteService;

@RestController
@RequestMapping("api/representantes")
public class RepresentanteController {

	@Autowired
	RepresentanteService representanteService;

	@GetMapping
	public ResponseEntity<List<RepresentanteDTO>> listar (){
		List<RepresentanteDTO> representantes = representanteService.buscarTodos();
		return ResponseEntity.status(HttpStatus.OK).body(representantes);
	}
	
}
	
	