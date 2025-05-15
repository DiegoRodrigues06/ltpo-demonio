package com.ltop.models;

import com.ltop.enuns.Tipo;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "tipo-usuario")
    private Tipo tipo;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false, unique = true)
    private String telefone;

    // Relação 1:N com Automoveis
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Automoveis> automoveis = new ArrayList<>();

    // Construtores
    public Usuario() {}

    public Usuario(String nome, String email, String senha, Tipo tipo, String telefone) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipo = tipo;
        this.telefone = telefone;
    }

    // Getters e setters
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Automoveis> getAutomoveis() {
        return automoveis;
    }

    public void setAutomoveis(List<Automoveis> automoveis) {
        this.automoveis = automoveis;
    }

    // Adiciona um automóvel ao usuário
    public void adicionarAutomovel(Automoveis automovel) {
        automoveis.add(automovel);
        automovel.setUsuario(this); // garante a consistência da relação
    }

    // Remove um automóvel do usuário
    public void removerAutomovel(Automoveis automovel) {
        automoveis.remove(automovel);
        automovel.setUsuario(null); // limpa a referência
    }
}
