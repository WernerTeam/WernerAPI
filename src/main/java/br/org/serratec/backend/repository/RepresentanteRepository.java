package br.org.serratec.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.backend.model.Representante;

import java.util.Optional;

import org.springframework.stereotype.Repository;



@Repository
public interface RepresentanteRepository extends JpaRepository<Representante, Long> {

	public Optional<Representante> findByCodigo(String codigo);
	
}