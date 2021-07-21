package br.org.serratec.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.backend.model.Representante;

public interface RepresentanteRepository extends JpaRepository<Representante, Long> {

	List<Representante> findById(long codigo);
	Representante findByCodigoAndSenha(long codigo, String senha);
}
