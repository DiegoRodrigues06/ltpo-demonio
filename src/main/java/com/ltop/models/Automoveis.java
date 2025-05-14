package com.ltop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;


@Entity
public class Automoveis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne // ✅ Isso indica que o campo "modelo" é uma chave estrangeira
    private Modelo modelo;

    private String placa;
    private int ano;
    private String cor;

    public Automoveis() {
    }

    public Automoveis(int id, Modelo modelo, String placa, int ano, String cor) {
        this.id = id;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
    }

    // Getters e setters (recomendado para funcionamento correto com JPA)
}