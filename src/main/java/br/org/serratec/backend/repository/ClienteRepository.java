package br.org.serratec.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.backend.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	List<Cliente> findById (long codigoCliente);
	Cliente findByRazaoSocialCliente (String razaoSocialCliente);
	
	
	

}
