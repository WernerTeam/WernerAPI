package br.org.serratec.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.backend.DTO.ArtigoFunDTO;
import br.org.serratec.backend.service.ArtigoFunService;

@RestController
@RequestMapping("/artigoFun")
public class ArtigoFunController {
	
	@Autowired
	ArtigoFunService artigoFunService;
	
	@GetMapping
	public ResponseEntity<List<ArtigoFunDTO>> listar (){
		return ResponseEntity.ok(artigoFunService.listar());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<ArtigoFunDTO> buscar (@PathVariable Long id){
		return ResponseEntity.ok(artigoFunService.buscar(id));
	}
	

}
