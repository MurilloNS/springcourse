package io.github.MurilloNS.service;

import io.github.MurilloNS.domain.entity.Pedido;
import io.github.MurilloNS.domain.enums.StatusPedido;
import io.github.MurilloNS.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
