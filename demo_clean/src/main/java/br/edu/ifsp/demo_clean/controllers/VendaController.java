package br.edu.ifsp.demo_clean.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.ifsp.demo_clean.models.Venda;
import br.edu.ifsp.demo_clean.services.VendaService;

public class VendaController {
	private VendaService vendaService;
	
	public VendaController(VendaService vendaService) {
		this.vendaService = vendaService;
	}
	
//    @PostMapping("/venda")
//    public String salvaVenda(@RequestBody Venda v){s.addV(v); return "ok venda";}
//
//    @GetMapping("/venda")
//    public List<Venda> todasV(){return s.vnd();}
}
