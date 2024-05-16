package com.deanaraujo.cadastromaster.service;

import com.deanaraujo.cadastromaster.model.Cliente;
import com.deanaraujo.cadastromaster.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public String save(Cliente cliente) {
        clienteRepository.save(cliente);
        return "Cliente criado com sucesso!";
    }

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> findById(String id) {
        return clienteRepository.findById(id);
    }
/* To implement latter
    public Cliente update(Cliente novoCliente) {
        Cliente antigoCliente = clienteRepository.findById(novoCliente.getCpf()).get();
        updateData(novoCliente, antigoCliente);
        return clienteRepository.save(novoCliente);
    }

    public void updateData(Cliente novoCliente, Cliente antigoCliente) {
        antigoCliente.setEndereco(novoCliente.getEndereco());
        antigoCliente.setGenero(novoCliente.getGenero());
        antigoCliente.setNome(novoCliente.getNome());
        antigoCliente.setRg(novoCliente.getRg());
        antigoCliente.setTelefone(novoCliente.getTelefone());
    }
*/
    public String deleteById(String id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (!cliente.isEmpty()) {
            clienteRepository.deleteById(id);
            return "Cliente deletado com sucesso";
        } else {
            return "Cliente não encontrado";
        }
    }
}
