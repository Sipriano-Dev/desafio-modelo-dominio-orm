package com.sipriano.desafio_dois.entities;

import java.util.ArrayList;
import java.util.List;

public class Participante {

    private Long id;
    private String nome;
    private String email;

    private List<Atividade> atividades = new ArrayList<>();

    public Participante() {
    }

    public Participante(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }
}
