package com.ltop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Modelo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String marca;

    public Modelo() {
        // Construtor padrão necessário para JPA
    }

    public Modelo(int id, String nome, String marca) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

