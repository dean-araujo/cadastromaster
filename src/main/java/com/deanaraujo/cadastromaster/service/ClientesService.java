package com.deanaraujo.cadastromaster.service;

import com.deanaraujo.cadastromaster.model.Cliente;
import com.deanaraujo.cadastromaster.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClientesService {

    @Autowired
    private ClientesRepository clienteRepository;

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Cliente> findById(@PathVariable String id) {
        return clienteRepository.findById(id);
    }
}
