package br.org.serratec.backend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "ARTIGOSCORES")
public class CorDesenvolvida {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO_COR")
	private long codigoCorArt;
	
	@Column(name = "DESCRICAO_COR")
	private String descricao;

	@Column(name = "DTCOR_ARTIGOSCORES")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date dataPedidoCorArt;

	@JsonBackReference
	@OneToMany
	@JoinColumn(name = "CODIGO_CLIENTE")
	private Cliente cliente;	
	
	
	
}
