package com.example.ExLivraria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Livros {

    @Id
    private int IdLivro;

    @Column
    private String nome;

    @Column
    private double preco;

    public int getIdLivro() {
        return IdLivro;
    }

    public void setIdLivro(int idLivro) {
        IdLivro = idLivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
