package br.edu.ifsp.demo_clean.services;

import java.util.List;

import br.edu.ifsp.demo_clean.models.Cliente;
import br.edu.ifsp.demo_clean.repositories.ClienteRepository;

public class ClienteService {
	private ClienteRepository clienteRepository;
	
	ClienteService(){};
	
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
}
