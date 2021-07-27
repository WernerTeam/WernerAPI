package br.org.serratec.backend.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.backend.model.Cliente;
import br.org.serratec.backend.model.CorDesenvolvimento;

public interface CorDesenvolvimentoRepository extends JpaRepository<CorDesenvolvimento, Long>{
	
	public List<CorDesenvolvimento> findByCodigo (Cliente codigoCliente);
	public List<CorDesenvolvimento> findByDate (Date dataPedidosCorCart);
}
