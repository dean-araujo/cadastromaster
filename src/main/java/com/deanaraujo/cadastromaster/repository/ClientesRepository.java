package com.deanaraujo.cadastromaster.repository;

import com.deanaraujo.cadastromaster.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<Cliente, String> {

}
