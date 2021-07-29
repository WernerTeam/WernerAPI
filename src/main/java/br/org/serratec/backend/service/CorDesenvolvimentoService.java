package br.org.serratec.backend.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.backend.DTO.CorDesenvolvimentoDTO;
import br.org.serratec.backend.model.CorDesenvolvimento;
import br.org.serratec.backend.repository.CorDesenvolvimentoRepository;

@Service
public class CorDesenvolvimentoService {

	@Autowired
	private CorDesenvolvimentoRepository corDesenvolvimentoRepository;

	
	public List<CorDesenvolvimentoDTO> listar(){
		List<CorDesenvolvimentoDTO> coresDesenvolvimentoDTO = new ArrayList<CorDesenvolvimentoDTO>();
		List<CorDesenvolvimento> cores = corDesenvolvimentoRepository.findAll();
		for (CorDesenvolvimento corDesenvolvimento : cores) {
			CorDesenvolvimentoDTO corDesenvolvimentoDTO = new CorDesenvolvimentoDTO(corDesenvolvimento);
			coresDesenvolvimentoDTO.add(corDesenvolvimentoDTO);
		}
		return coresDesenvolvimentoDTO;
	}
	
	public CorDesenvolvimentoDTO buscarCodigo (Long codigoCor) {
		return corDesenvolvimentoRepository.findByCodigoCor(codigoCor);
	}
	
	public List<CorDesenvolvimentoDTO> buscarData (Date dataPedidoCorCart) {
		return corDesenvolvimentoRepository.findByDate(dataPedidoCorCart);
	
}

}