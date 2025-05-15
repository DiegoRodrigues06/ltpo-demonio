package com.ltop.models;

import jakarta.persistence.*;

@Entity
public class Automoveis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Modelo modelo;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private String placa;
    private int ano;
    private String cor;

    public Automoveis() {}

    public Automoveis(Modelo modelo, String placa, int ano, String cor, Usuario usuario) {
        this.id = id;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
        this.usuario = usuario;
    }

    // Getters e setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Modelo getModelo() { return modelo; }
    public void setModelo(Modelo modelo) { this.modelo = modelo; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
}
