package br.org.serratec.backend.enums;

public enum Status {
	C(0),
	E(1),
	L(2);
	
	private Integer codigo;
	
	private Status(Integer codigo) {
		this.codigo = codigo;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public static Status valueOf(Integer codigo) {
		for (Status status : Status.values()) {
			if (status.getCodigo() == codigo) {
				return status;
			}
		}
		throw new IllegalArgumentException("Código de status inválido!");
	}
}

