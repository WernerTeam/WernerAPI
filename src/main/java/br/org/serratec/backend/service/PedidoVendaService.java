package br.org.serratec.backend.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.backend.DTO.PedidoVendaDTO;
import br.org.serratec.backend.model.PedidoVenda;
import br.org.serratec.backend.repository.PedidoVendaRepository;

@Service
public class PedidoVendaService {

	@Autowired
	PedidoVendaRepository pedidoVendaRepository;
	
	public List<PedidoVendaDTO> listar(){
		List<PedidoVendaDTO> pedidosVendaDTO = new ArrayList <PedidoVendaDTO>();
		List<PedidoVenda> pedidos = pedidoVendaRepository.findAll();
		for(PedidoVenda pedidosVenda : pedidos) {
			PedidoVendaDTO pedidoVendaDTO = new PedidoVendaDTO(pedidosVenda);
			pedidosVendaDTO.add(pedidoVendaDTO);
		}
		 return pedidosVendaDTO;
	}
	
	public PedidoVendaDTO buscar (Long numeroPedido) {
		return pedidoVendaRepository.findByNumeroPedido(numeroPedido);
		
	}
	
	public List<PedidoVendaDTO> buscarCliente (String cliente) {
		return pedidoVendaRepository.findByCliente(cliente);
	}
	
	public List<PedidoVendaDTO> buscarDataPedido (Date dataPedido) {
		return pedidoVendaRepository.findBydataPedido(dataPedido);
		
	}
	
	public List<PedidoVendaDTO> buscarDataEntrega (Date dataEntrega) {
		return pedidoVendaRepository.findBydataEntrega(dataEntrega);
	}

}
	
