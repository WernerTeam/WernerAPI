package br.org.serratec.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.backend.DTO.EstampadoItemDTO;
import br.org.serratec.backend.model.EstampadoItem;
import br.org.serratec.backend.repository.EstampadoItemRepository;

@Service
public class EstampadoItemService {
	
	@Autowired
	EstampadoItemRepository estampadoItemRepository;
	
	public List<EstampadoItemDTO> listar(){
		List<EstampadoItemDTO> estampadosItensDTO = new ArrayList <EstampadoItemDTO>();
		List<EstampadoItem> estampadosItens = estampadoItemRepository.findAll();
		for (EstampadoItem estampadoItem : estampadosItens) {
			EstampadoItemDTO estampadoItemDTO = new EstampadoItemDTO(estampadoItem);
			estampadosItensDTO.add(estampadoItemDTO);
		}
		return estampadosItensDTO;
	}
	
	public EstampadoItemDTO buscar (Long idEstampadoItem) {
		return estampadoItemRepository.findByIdEstampadoItem(idEstampadoItem);
	}
	

}
