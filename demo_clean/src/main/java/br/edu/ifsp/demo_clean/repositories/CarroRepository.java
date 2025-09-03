package br.edu.ifsp.demo_clean.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifsp.demo_clean.models.Carro;
import br.edu.ifsp.demo_clean.models.Cliente;

public class CarroRepository {
	private List<Carro> carros = new ArrayList<>();
	
	CarroRepository(){};
	
    public void adicionarCarro(Carro carro){
    	carros.add(carro);
    }
    public List<Carro> filtrarCarros(){
    	return carros; // verificar retorno
    }
}
