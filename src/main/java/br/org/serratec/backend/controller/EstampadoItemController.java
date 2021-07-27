package br.org.serratec.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.backend.DTO.EstampadoItemDTO;
import br.org.serratec.backend.service.EstampadoItemService;

@RestController
@RequestMapping ("api/auth/estampadosItens")
public class EstampadoItemController {
	@Autowired
	EstampadoItemService estampadoItemService;
	
	
	@GetMapping
	public ResponseEntity<List<EstampadoItemDTO>> listar (){
		return ResponseEntity.ok(estampadoItemService.listar());
	}

}
