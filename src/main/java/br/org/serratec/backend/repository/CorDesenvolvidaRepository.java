package br.org.serratec.backend.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.serratec.backend.DTO.CorDesenvolvidaDTO;
import br.org.serratec.backend.model.CorDesenvolvida;

@Repository
public interface CorDesenvolvidaRepository extends JpaRepository<CorDesenvolvida, Long> { 
	
	public  CorDesenvolvidaDTO findBycodigoCorArtcodigoCorArt (String codigoCorArt);
	public List <CorDesenvolvidaDTO> findByClienteRazaoSocialClienteContaining (String razaoSocialCliente);
	public List <CorDesenvolvidaDTO> findByDataPedidoCorArtLessThanEqual (Date dataPedidoCorArt);
	public List <CorDesenvolvidaDTO> findByDataPedidoCorArtGreaterThanEqual (Date dataPedidoCorArt);
}
	


