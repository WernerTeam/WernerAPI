package br.org.serratec.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.backend.DTO.RepresentanteDTO;
import br.org.serratec.backend.service.RepresentanteService;

@RestController
@RequestMapping("/representantes")
public class RepresentanteController {

	@Autowired
	RepresentanteService representanteService;

	@GetMapping
	public ResponseEntity<List<RepresentanteDTO>> listar (){
		return ResponseEntity.ok(representanteService.listar());
	}
	
	@GetMapping("/validar/{codigo}/{senha}")
	public ResponseEntity<RepresentanteDTO> buscarPorCodigoESenha(@PathVariable long codigo, @PathVariable String senha){
		return ResponseEntity.ok(representanteService.buscarPorCodigoESenha(codigo, senha));
	}
	
	
}
