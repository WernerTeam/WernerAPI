package br.org.serratec.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.backend.DTO.ClienteDTO;
import br.org.serratec.backend.model.Cliente;
import br.org.serratec.backend.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<ClienteDTO> listar () { 
		List<ClienteDTO> clientesDTO = new ArrayList<ClienteDTO>();
		List<Cliente>clientes = clienteRepository.findAll();
		for(Cliente cliente : clientes) {
			ClienteDTO clienteDTO = new ClienteDTO(cliente);
			clientesDTO.add(clienteDTO);
		}
		
		return clientesDTO;
	}
	
	public ClienteDTO buscar (String razaoSocialCliente) {
		return new ClienteDTO (clienteRepository.findByRazaoSocialCliente(razaoSocialCliente));
		
	}
	
}
	