package br.com.pulse.model;

import lombok.Data;

@Data
public class Filial {
    private Long id;
    private String cnpj;
    private String nome;
    private String endereco;
    private String telefone;
}
