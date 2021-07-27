package br.org.serratec.backend.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.backend.DTO.CorSolicDTO;
import br.org.serratec.backend.DTO.EstampadoDTO;
import br.org.serratec.backend.model.CorSolic;
import br.org.serratec.backend.repository.CorSolicRepository;

@Service
public class CorSolicService {
	@Autowired
	CorSolicRepository corSolicRepository;
	
	public List<CorSolicDTO> listar (){
		List<CorSolicDTO> coresSolicDTO = new ArrayList<CorSolicDTO>();
		List<CorSolic> coresSolic = corSolicRepository.findAll();
		for(CorSolic corSolic : coresSolic) {
			CorSolicDTO corSolicDTO = new CorSolicDTO (corSolic);
			coresSolicDTO.add(corSolicDTO);
		}
			return coresSolicDTO;	
	}
	
	public CorSolicDTO buscar (Long codigoCor) {
		return corSolicRepository.findByCodigoCor(codigoCor);
		
	}
	
	public List<CorSolicDTO> buscarCliente (String razaoSocialCliente) {
		return corSolicRepository.findByClienteRazaoSocialClienteContaining(razaoSocialCliente);
	}
	
	public List<CorSolicDTO> buscarDataInicial (Date dataPedidoCor) {
		return corSolicRepository.findByDataPedidoCorGreaterThanEqual(dataPedidoCor);
		
	}
	
	public List<CorSolicDTO> buscarDataFinal (Date dataPedidoCor) {
		return corSolicRepository.findByDataPedidoCorLessThanEqual(dataPedidoCor);
	}

}
