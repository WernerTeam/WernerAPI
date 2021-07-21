package br.org.serratec.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.backend.DTO.RepresentanteDTO;
import br.org.serratec.backend.model.Representante;
import br.org.serratec.backend.repository.RepresentanteRepository;

@Service
public class RepresentanteService {

	@Autowired
	private RepresentanteRepository representanteRepository;
		
	
	public List <RepresentanteDTO> listar() {
		List<Representante> representantes = representanteRepository.findAll();
		List<RepresentanteDTO> representantesDTO = new ArrayList<RepresentanteDTO>();
		for (Representante representante : representantes) {
			RepresentanteDTO representanteDTO = new RepresentanteDTO(representante);
			representantesDTO.add(representanteDTO);
		}
		return representantesDTO;
		
	}
	
	
	public RepresentanteDTO buscarPorCodigoESenha(long codigo, String senha) {
		return new RepresentanteDTO(representanteRepository.findByCodigoAndSenha(codigo, senha));
	}
}





















