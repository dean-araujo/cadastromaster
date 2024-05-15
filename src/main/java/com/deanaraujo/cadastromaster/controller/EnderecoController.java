package com.deanaraujo.cadastromaster.controller;

import com.deanaraujo.cadastromaster.model.Endereco;
import com.deanaraujo.cadastromaster.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    EnderecoService enderecoService;

    @GetMapping("/findall")
    public List<Endereco> findAll() {
        return enderecoService.findAll();
    }

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Endereco> findById(@PathVariable Integer id){
        return enderecoService.findById(id);
    }
}
