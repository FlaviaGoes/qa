package br.edu.ifsp.demo_clean.services;

import br.edu.ifsp.demo_clean.repositories.VendaRepository;

public class VendaService {
	private VendaRepository vendaRepository;
	
	VendaService(){}
	
	VendaService(VendaRepository vendaRepository){
		this.vendaRepository = vendaRepository;
	}
	
}
