package br.org.serratec.backend.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.backend.model.PedidoDesenvolvimentoEstampado;

public interface PedidoDesenvolvimentoEstampadoRepository extends JpaRepository <PedidoDesenvolvimentoEstampado,Long> {
	
	Optional<PedidoDesenvolvimentoEstampado> FindByCodEstampado (Long codigo);
	Optional<PedidoDesenvolvimentoEstampado> FindByDataPedido (Date data);

}
