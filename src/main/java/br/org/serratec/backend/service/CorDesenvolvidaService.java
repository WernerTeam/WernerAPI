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
		List<CorDesenvolvidaDTO> coresDTO = new ArrayList <CorDesenvolvidaDTO>();
		List<CorDesenvolvida> cores = corDesenvolvidaRepository.findAll();
		for(CorDesenvolvida cor : cores) {
			CorDesenvolvidaDTO corDTO = new CorDesenvolvidaDTO(cor);
			coresDTO.add(corDTO);
		}
		return coresDTO;
	}
	
	public CorDesenvolvidaDTO buscar (String corDesenvolvida) {
		return corDesenvolvidaRepository.findByCodigoCorArt(corDesenvolvida);
		
	}
	
	public List<CorDesenvolvidaDTO> buscarCliente (String razaoSocialCliente){
		return corDesenvolvidaRepository.findByClienteRazaoSocialClienteContaining(razaoSocialCliente);
	}
		
	public List<CorDesenvolvidaDTO> buscarDataInicial (Date dataPedidoCorArt) {
		return corDesenvolvidaRepository.findByDataPedidoCorArtLessThanEqual(dataPedidoCorArt);
		
	}
	
	public List<CorDesenvolvidaDTO> buscarDataFinal (Date dataPedidoCorArt) {
		return corDesenvolvidaRepository.findByDataPedidoCorArtGreaterThanEqual(dataPedidoCorArt);
	}
	
	
}
