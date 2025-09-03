package br.edu.ifsp.demo_clean.controllers;

import org.springframework.web.bind.annotation.*;

import br.edu.ifsp.demo_clean.models.Carro;
import br.edu.ifsp.demo_clean.models.Cliente;
import br.edu.ifsp.demo_clean.models.Venda;
import br.edu.ifsp.demo_clean.services.ClienteService;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.*;

@RestController
@RequestMapping("/api")
@Tag(name = "Cliente ", description = "Responsável por controlar as requisições para clientes")

public class ClienteController {

    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
    	this.clienteService=clienteService;
    }

//    @PostMapping("/cliente")
//    public String salvarCliente(@RequestBody Cliente c){s.addCli(c); return "Cliente salvo com sucesso";}
//
//    @GetMapping("/cliente")
//    public List<Cliente> listarClientes(){return s.tdsCli();}
}