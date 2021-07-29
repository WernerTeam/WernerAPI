package br.org.serratec.backend.DTO;

import br.org.serratec.backend.enums.Status;
import br.org.serratec.backend.model.Estampado;
import br.org.serratec.backend.model.EstampadoItem;

public class EstampadoItemDTO {
	
	private Long idEstampadoItem;
	private String codigoArtigo;
	private Long codigoDesenho;
	private Long codigoVariante;
	private Estampado codigoEstampado;
	private Status status;
	
	public EstampadoItemDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public EstampadoItemDTO(EstampadoItem estampadoItem) {
		super();
		this.idEstampadoItem = estampadoItem.getIdEstampadoItem();
		this.codigoArtigo = estampadoItem.getCodigoArtigo();
		this.codigoDesenho = estampadoItem.getCodigoDesenho();
		this.codigoVariante = estampadoItem.getCodigoVariante();
		this.codigoEstampado = estampadoItem.getCodigoEstampado();
		this.status = estampadoItem.getStatus();
	}
	public Long getIdEstampadoItem() {
		return idEstampadoItem;
	}
	public void setIdEstampadoItem(Long idEstampadoItem) {
		this.idEstampadoItem = idEstampadoItem;
	}
	public String getCodigoArtigo() {
		return codigoArtigo;
	}
	public void setCodigoArtigo(String codigoArtigo) {
		this.codigoArtigo = codigoArtigo;
	}
	public Long getCodigoDesenho() {
		return codigoDesenho;
	}
	public void setCodigoDesenho(Long codigoDesenho) {
		this.codigoDesenho = codigoDesenho;
	}
	public Long getCodigoVariante() {
		return codigoVariante;
	}
	public void setCodigoVariante(Long codigoVariante) {
		this.codigoVariante = codigoVariante;
	}
	public Estampado getCodigoEstampado() {
		return codigoEstampado;
	}
	public void setCodigoEstampado(Estampado codigoEstampado) {
		this.codigoEstampado = codigoEstampado;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
	

}
