package br.org.serratec.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.backend.DTO.EstampadoItemDTO;
import br.org.serratec.backend.model.EstampadoItem;

public interface EstampadoItemRepository extends JpaRepository<EstampadoItem, Long>{
	
	public EstampadoItemDTO findByIdEstampadoItem (Long idEstampadoItem);
	
	

}
