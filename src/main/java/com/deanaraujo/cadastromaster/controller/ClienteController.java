package com.deanaraujo.cadastromaster.controller;

import com.deanaraujo.cadastromaster.model.Cliente;
import com.deanaraujo.cadastromaster.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;
/*
    @PostMapping
    public String save(Cliente cliente) {

    }
*/
    @GetMapping("/findall")
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Cliente> findById(@PathVariable String id) {
        return clienteService.findById(id);
    }
/*
    @PostMapping
    public void update(@PathVariable Cliente novoCliente) {
        clienteService.update(novoCliente);
    }
*/
    @DeleteMapping(value = "{id}")
    public String deleteById(@PathVariable String id) {
        return clienteService.deleteById(id);
    }
}
