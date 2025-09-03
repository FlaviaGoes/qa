package br.edu.ifsp.demo_clean.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.demo_clean.models.Carro;
import br.edu.ifsp.demo_clean.services.CarroService;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
@Tag(name = "Carro", description = "Responsável por controlar as requisições para carros")

public class CarroController {
	private CarroService carroService;
	
	public CarroController(CarroService carroService) {
		this.carroService = carroService;
	}
	
//	@PostMapping("/carro")
//    public String salvarCarro(@RequestBody Carro c){s.addCar(c);return "ok carro";}
//
//    @GetMapping("/carro")
//    public List<Carro> todosCar(){return s.tudoCarro();}

}
