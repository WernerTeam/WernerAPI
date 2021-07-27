package br.org.serratec.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.serratec.backend.model.CorDesenvolvida;

@Repository
public interface CorDesenvolvidaRepository extends JpaRepository<CorDesenvolvida, Long> { 
	public CorDesenvolvida findBycodigoCorArtCorDesenvolvida (Long CorDesenvolvida);
	

}
