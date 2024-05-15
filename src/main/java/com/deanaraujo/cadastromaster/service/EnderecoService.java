package com.deanaraujo.cadastromaster.service;

import com.deanaraujo.cadastromaster.model.Endereco;
import com.deanaraujo.cadastromaster.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    public List<Endereco> findAll() {
        return enderecoRepository.findAll();
    }

    public Optional<Endereco> findById(Integer id) {
        return enderecoRepository.findById(id);
    }
}
