package br.edu.ifsp.demo_clean.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifsp.demo_clean.models.Carro;
import br.edu.ifsp.demo_clean.models.Venda;


public class VendaRepository {
	private List<Venda> vendas = new ArrayList<>();
	
	VendaRepository(){};
    
    public void adicionarVenda(Venda venda){
    	vendas.add(venda);
    }
    public List<Venda> filtrarVendas(){
    	return vendas; // verificar retorno
    }
}
