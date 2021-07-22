package br.org.serratec.backend.DTO;

import br.org.serratec.backend.model.Representante;

public class RepresentanteDTO {
	private String codigo;
	//private String senha;
	
	
	public RepresentanteDTO(Representante representante) {
		super();
		this.codigo = representante.getCodigo();
		//this.senha = representante.getSenha();
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
//	public String getSenha() {
//		return senha;
//	}
//	public void setSenha(String senha) {
//		this.senha = senha;
//	}
	
}
