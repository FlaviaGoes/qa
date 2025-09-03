package br.edu.ifsp.demo_clean.models;

import jakarta.persistence.*;

@Entity
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int codigoCarro;

    public String nome;
    public String cor;
    public double valor;

    @ManyToOne
    public Cliente cliente;

    public Carro(){}

    public Carro(String nome, String cor, double valor, Cliente cliente){
        this.nome=nome; this.cor=cor; this.valor=valor; this.cliente=cliente;
    }
}

