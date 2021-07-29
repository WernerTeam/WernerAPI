package br.org.serratec.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.backend.DTO.ArtigoFunDTO;
import br.org.serratec.backend.model.ArtigoFun;

public interface ArtigoFunRepository extends JpaRepository<ArtigoFun, Long> {
	
	public ArtigoFunDTO findByIdArtigoFun (Long idArtigoFun);
	
	

}
