package br.org.serratec.backend.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.backend.DTO.CorDesenvolvidaDTO;
import br.org.serratec.backend.model.CorDesenvolvida;
import br.org.serratec.backend.repository.CorDesenvolvidaRepository;

@Service
public class CorDesenvolvidaService {

	@Autowired
	private CorDesenvolvidaRepository corDesenvolvidaRepository;
	
	public List<CorDesenvolvidaDTO> listar () { 
		List<CorDesenvolvidaDTO> coresDTO = new ArrayList<CorDesenvolvidaDTO>();
		List<CorDesenvolvida>cores = corDesenvolvidaRepository.findAll();
		for(CorDesenvolvida corDesenvolvida : cores) {
			CorDesenvolvidaDTO corDTO = new CorDesenvolvidaDTO(corDesenvolvida);
			//coresDTO.add(coresDTO);
		}
		
		return coresDTO;
	}
	
	public CorDesenvolvidaDTO buscar (String corDesenvolvida) {
		return corDesenvolvidaRepository.findBycodigoCorArtcodigoCorArt(corDesenvolvida);
		
	}
	public List<CorDesenvolvidaDTO> buscarCliente (String descricao) {
		return corDesenvolvidaRepository.findBydescricao(descricao);
	}
	
	public List<CorDesenvolvidaDTO> buscarDataInicial (Date dataPedidoCorArt) {
		return corDesenvolvidaRepository.findByDataPedidoCorArtLessThanEqual(dataPedidoCorArt);
		
	}
	
	public List<CorDesenvolvidaDTO> buscarDataFinal (Date dataPedidoCorArt) {
		return corDesenvolvidaRepository.findByDataPedidoCorArtGreaterThanEqual(dataPedidoCorArt);
	}
	
	
}
