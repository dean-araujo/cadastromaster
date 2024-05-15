package com.deanaraujo.cadastromaster.service;

import com.deanaraujo.cadastromaster.model.Endereco;
import com.deanaraujo.cadastromaster.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/endereco")
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Endereco> findById(@PathVariable Integer id){
        return enderecoRepository.findById(id);
    }
}
