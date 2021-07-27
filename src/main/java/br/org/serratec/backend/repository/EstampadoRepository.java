package br.org.serratec.backend.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.serratec.backend.DTO.EstampadoDTO;
import br.org.serratec.backend.model.Estampado;

@Repository
public interface EstampadoRepository extends JpaRepository<Estampado, Long>{
	public EstampadoDTO findByCodigoEstampado (Long codigoEstampado);
	public List<EstampadoDTO> findByDataPedido (Date dataPedido);	
	public List<EstampadoDTO> findByClienteRazaoSocialClienteContaining (String razaoSocialCliente);
	public List<EstampadoDTO> findByDataPedidoLessThanEqual (Date dataPedido);
	public List<EstampadoDTO> findByDataPedidoGreaterThanEqual (Date dataPedido);
}
