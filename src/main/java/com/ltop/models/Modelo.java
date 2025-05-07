package com.ltop.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Modelo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String marca;

    public Modelo(int id, String nome, String marca) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
    }
}

