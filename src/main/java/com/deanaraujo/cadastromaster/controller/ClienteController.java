package com.deanaraujo.cadastromaster.controller;

import com.deanaraujo.cadastromaster.model.Cliente;
import com.deanaraujo.cadastromaster.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/findall")
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Cliente> findById(@PathVariable String id) {
        return clienteService.findById(id);
    }
}
