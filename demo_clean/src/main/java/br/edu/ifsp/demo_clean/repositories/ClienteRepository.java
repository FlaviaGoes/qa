package br.edu.ifsp.demo_clean.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifsp.demo_clean.models.Cliente;

public class ClienteRepository {
	private List<Cliente> clientes = new ArrayList<>();
	
	public void adicionarCliente(Cliente cliente){
		clientes.add(cliente);
	}
    public List<Cliente> filtrarClientes(){
    	return clientes; // verificar retorno
    }
}
