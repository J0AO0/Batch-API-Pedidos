package com.servico.externo.servicoExterno.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DadosDTO {

    private String nome;
    private String descricao;
    private String email;
    private String senha;

}
