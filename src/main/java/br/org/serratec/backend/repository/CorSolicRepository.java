package br.org.serratec.backend.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.backend.DTO.CorSolicDTO;
import br.org.serratec.backend.model.CorSolic;

public interface CorSolicRepository extends JpaRepository<CorSolic, Long>{
	
	public CorSolicDTO findByCodigoCor (Long codigoCor);
	public List<CorSolicDTO> findByClienteRazaoSocialClienteContaining (String razaoSocialCliente);
	public List<CorSolicDTO> findByDataPedidoCorLessThanEqual (Date dataPedidoCor);
	public List<CorSolicDTO> findByDataPedidoCorGreaterThanEqual (Date dataPedidoCor);
	
	

}
