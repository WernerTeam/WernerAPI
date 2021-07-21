package br.org.serratec.backend.DTO;

import br.org.serratec.backend.model.Representante;

public class RepresentanteDTO {
	private long codigo;
	private String senha;
	
	
	public RepresentanteDTO(Representante representante) {
		super();
		this.codigo = representante.getCodigo();
		this.senha = representante.getSenha();
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
