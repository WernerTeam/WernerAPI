package br.org.serratec.backend.DTO;

import br.org.serratec.backend.model.Cliente;

public class ClienteDTO {
	private long codigoCliente;
	private String razaoSocialCliente;

	public ClienteDTO(Cliente cliente) {
		super();
		this.codigoCliente = cliente.getCodigoCliente();
		this.razaoSocialCliente = cliente.getRazaoSocialCliente();
	}
	
	public String getRazaoSocialCliente() {
		return razaoSocialCliente;
	}

	public void setRazaoSocialCliente(String razaoSocialCliente) {
		this.razaoSocialCliente = razaoSocialCliente;
	}

	public long getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

}

