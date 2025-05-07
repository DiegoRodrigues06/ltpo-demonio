package com.ltop.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Automoveis {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Modelo modelo;
    private String placa;
    private int ano;
    private String cor;

    public Automoveis(int id, Modelo modelo, String placa, int ano, String cor) {
        this.id = id;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
    }
}


