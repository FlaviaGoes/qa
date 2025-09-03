package br.edu.ifsp.demo_clean.models;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idCliente;

    public String nome;

    @OneToMany(mappedBy="cliente")
    public List<Carro> carros = new ArrayList<>();

    public Cliente(String nome){
        this.nome=nome;
    }
}
