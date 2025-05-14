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
}

