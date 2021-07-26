package br.org.serratec.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import br.org.serratec.backend.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	public List<Cliente> findById (long codigoCliente);
	public Cliente findByRazaoSocialCliente (String razaoSocialCliente);
	
	
	

}
