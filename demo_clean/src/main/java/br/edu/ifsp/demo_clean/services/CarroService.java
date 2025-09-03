package br.edu.ifsp.demo_clean.services;

import org.springframework.stereotype.Service;

import br.edu.ifsp.demo_clean.models.Carro;
import br.edu.ifsp.demo_clean.models.Cliente;
import br.edu.ifsp.demo_clean.models.Venda;
import br.edu.ifsp.demo_clean.repositories.CarroRepository;
import br.edu.ifsp.demo_clean.repositories.ClienteRepository;
import br.edu.ifsp.demo_clean.repositories.VendaRepository;

import java.util.*;

@Service
public class CarroService {

    private CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository){
        this.carroRepository=carroRepository;
    }

}
