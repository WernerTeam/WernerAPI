package br.org.serratec.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.backend.DTO.ArtigoFunDTO;
import br.org.serratec.backend.model.ArtigoFun;
import br.org.serratec.backend.repository.ArtigoFunRepository;

@Service
public class ArtigoFunService {
	
	@Autowired
	ArtigoFunRepository artigoFunRepository;
	
	public List<ArtigoFunDTO> listar (){
		List<ArtigoFunDTO> artigosDTO = new ArrayList <ArtigoFunDTO>();
		List<ArtigoFun> artigos = artigoFunRepository.findAll();
		for(ArtigoFun artigo : artigos) {
			ArtigoFunDTO artigoDTO = new ArtigoFunDTO(artigo);
			artigosDTO.add(artigoDTO);
			}
		return artigosDTO;
		
	}
	
	public ArtigoFunDTO buscar (Long idArtigoFun) {
		return artigoFunRepository.findByIdArtigoFun(idArtigoFun);
	}

}
