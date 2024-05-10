package com.deanaraujo.cadastromaster.model;

import java.util.List;
import java.util.Objects;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;
    private Gender genero;
    private Integer telefone;

    public Cliente(){
    }

    public Cliente(String nome, String sobrenome, String cpf, String rg, Gender genero, Integer telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Gender getGenero() {
        return genero;
    }

    public void setGenero(Gender genero) {
        this.genero = genero;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }
}
