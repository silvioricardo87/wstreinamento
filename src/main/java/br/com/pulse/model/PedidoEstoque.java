package br.com.pulse.model;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class PedidoEstoque {
    private Integer id;
    private UUID uid;
    private Filial filial;
    private Date data;
    private Integer tipoEntrada;
    private List<ItemPedidoEstoque> itensPedidos;
    private List<Produto> produtos;
}
