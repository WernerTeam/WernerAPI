package br.org.serratec.backend.DTO;


import br.org.serratec.backend.model.ArtigoFun;
import br.org.serratec.backend.model.EstampadoItem;

public class ArtigoFunDTO {
	
	private Long idArtigoFun;
	private EstampadoItem codigoArtigo;
	private EstampadoItem codigoDesenho;
	private EstampadoItem codigoCor;
	
	public ArtigoFunDTO() {
		// TODO Auto-generated constructor stub
	}

	public ArtigoFunDTO(ArtigoFun artigoFun) {
		super();
		this.idArtigoFun = artigoFun.getIdArtigoFun();
		this.codigoArtigo = artigoFun.getCodigoArtigo();
		this.codigoDesenho = artigoFun.getCodigoDesenho();
		this.codigoCor = artigoFun.getCodigoCor();
	}

	public Long getIdArtigoFun() {
		return idArtigoFun;
	}

	public void setIdArtigoFun(Long idArtigoFun) {
		this.idArtigoFun = idArtigoFun;
	}

	public EstampadoItem getCodigoArtigo() {
		return codigoArtigo;
	}

	public void setCodigoArtigo(EstampadoItem codigoArtigo) {
		this.codigoArtigo = codigoArtigo;
	}

	public EstampadoItem getCodigoDesenho() {
		return codigoDesenho;
	}

	public void setCodigoDesenho(EstampadoItem codigoDesenho) {
		this.codigoDesenho = codigoDesenho;
	}

	public EstampadoItem getCodigoCor() {
		return codigoCor;
	}

	public void setCodigoCor(EstampadoItem codigoCor) {
		this.codigoCor = codigoCor;
	}
	
	
	
	

}
