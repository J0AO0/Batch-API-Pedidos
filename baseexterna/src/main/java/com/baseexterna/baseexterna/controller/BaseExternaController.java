package com.baseexterna.baseexterna.controller;

import com.baseexterna.baseexterna.service.ServicoExternoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "base-externa")
public class BaseExternaController {

    @Autowired
    private ServicoExternoService servicoExternoService;

    @GetMapping(path = "get-all")
    public ResponseEntity getAllDadosServicoEXterno(){

        var response = servicoExternoService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(response);

    }
}
