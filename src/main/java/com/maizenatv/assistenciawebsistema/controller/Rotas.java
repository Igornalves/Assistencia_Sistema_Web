package com.maizenatv.assistenciawebsistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.maizenatv.assistenciawebsistema.services.CustomerService;

@RestController
public class Rotas {

    @Autowired
    private CustomerService viaCepService;

    @GetMapping("/")
    public String GetRota(){
        return "Olá coisas novas";
    }

    @GetMapping("/cep/{cep}")
    public Object buscarEndereco(@PathVariable String cep) {
        return viaCepService.buscarEnderecoPorCep(cep);
    }
} 