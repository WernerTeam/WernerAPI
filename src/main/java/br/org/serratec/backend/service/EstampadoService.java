package br.org.serratec.backend.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.backend.DTO.EstampadoDTO;
import br.org.serratec.backend.model.Estampado;
import br.org.serratec.backend.repository.EstampadoRepository;

@Service
public class EstampadoService {
	
	@Autowired
	EstampadoRepository estampadoRepository;
	
	public List<EstampadoDTO> listar(){
		List<EstampadoDTO> estampadosDTO = new ArrayList <EstampadoDTO>();
		List<Estampado> estampados = estampadoRepository.findAll();
		for(Estampado estampado : estampados) {
			EstampadoDTO estampadoDTO = new EstampadoDTO(estampado);
			estampadosDTO.add(estampadoDTO);
		}
		 return estampadosDTO;
	}
	
	public EstampadoDTO buscar (Long codigoEstampado) {
		return estampadoRepository.findByCodigoEstampado(codigoEstampado);
		
	}
	
	public List<EstampadoDTO> buscarCliente (String razaoSocialCliente) {
		return estampadoRepository.findByClienteRazaoSocialClienteContaining(razaoSocialCliente);
	}
	
	public List<EstampadoDTO> buscarDataInicial (Date dataPedido) {
		return estampadoRepository.findByDataPedidoGreaterThanEqual(dataPedido);
		
	}
	
	public List<EstampadoDTO> buscarDataFinal (Date dataPedido) {
		return estampadoRepository.findByDataPedidoLessThanEqual(dataPedido);
	}

}
