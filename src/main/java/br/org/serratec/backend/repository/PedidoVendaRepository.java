package br.org.serratec.backend.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.backend.DTO.PedidoVendaDTO;
import br.org.serratec.backend.model.PedidoVenda;

public interface PedidoVendaRepository extends JpaRepository<PedidoVenda, Long> {

	public PedidoVendaDTO findByNumeroPedido (Long numeroPedido);
	public List<PedidoVendaDTO> findByCliente (String cliente);
	public List<PedidoVendaDTO> findBydataPedido (Date dataPedido);
	public List<PedidoVendaDTO> findBydataEntrega (Date dataEntrega);
	
}
