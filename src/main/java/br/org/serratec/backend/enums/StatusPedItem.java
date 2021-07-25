package br.org.serratec.backend.enums;

public enum StatusPedItem {
	C(0),
	E(1),
	L(2);
	
	private Integer codigo;
	
	private StatusPedItem(Integer codigo) {
		this.codigo = codigo;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public static StatusPedItem valueOf(Integer codigo) {
		for (StatusPedItem status : StatusPedItem.values()) {
			if (status.getCodigo() == codigo) {
				return status;
			}
		}
		throw new IllegalArgumentException("Código de status inválido!");
	}
}

