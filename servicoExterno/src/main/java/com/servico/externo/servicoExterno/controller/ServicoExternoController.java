package com.servico.externo.servicoExterno.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/servico-externo")
public class ServicoExternoController {

    @GetMapping("/recupera-infos")
    public ResponseEntity retornaInformacoesServicoExterno(){

        List<DadosDTO> lista = new ArrayList<>();

        lista.add(DadosDTO.builder()
                .nome("nome serviço externo 1")
                .descricao("descrição serviço externo 1")
                .senha("senha serviço externo 1")
                .email("emailservicoexterno1@enail.com")
                .build());

        lista.add(DadosDTO.builder()
                .nome("nome serviço externo 2")
                .descricao("descrição serviço externo 2")
                .senha("senha serviço externo 2")
                .email("emailservicoexterno2@enail.com")
                .build());

        lista.add(DadosDTO.builder()
                .nome("nome serviço externo 3")
                .descricao("descrição serviço externo 3")
                .senha("senha serviço externo 3")
                .email("emailservicoexterno3@enail.com")
                .build());

        return ResponseEntity.ok(lista);

    }
}
