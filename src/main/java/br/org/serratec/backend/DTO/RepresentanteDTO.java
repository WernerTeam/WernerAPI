package br.org.serratec.backend.DTO;

import br.org.serratec.backend.model.Representante;

public class RepresentanteDTO {
	private String codigo;
	
	public RepresentanteDTO(Representante representante) {
		super();
		this.codigo = representante.getCodigo();
		
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	
}
