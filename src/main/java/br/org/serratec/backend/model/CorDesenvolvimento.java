package br.org.serratec.backend.model;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name= "ARTIGOSCORSOLICART") //"ARTIGOS")
public class CorDesenvolvimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODCOR_ARTIGOSCORSOLIC")
	private long codigoCorCart;
	
	@Column(name = "CODIGO_ARTIGO")
	private long codigoArtigo;

	@Column(name = "DTENVICLI_ARTIGOSCORSOLICART")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date dataPedidoCorCart;

}
