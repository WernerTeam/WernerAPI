package br.org.serratec.backend.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.backend.DTO.CorDesenvolvimentoDTO;
import br.org.serratec.backend.model.CorDesenvolvimento;

public interface CorDesenvolvimentoRepository extends JpaRepository<CorDesenvolvimento, Long>{
	
	public CorDesenvolvimentoDTO findByCodigoCor (Long codigoCor);
	public List<CorDesenvolvimentoDTO> findByDate (Date dataPedidoCorCart);
}
