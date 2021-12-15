package br.com.everis.petexample.petexample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import br.com.everis.petexample.petexample.model.Cliente;
import br.com.everis.petexample.petexample.repository.ClienteRepositoty;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepositoty clienteRepositoty;
    
    @GetMapping("/list")
    public List<Cliente> listar(){
        return clienteRepositoty.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> listarId(@PathVariable("id") long id){
        return clienteRepositoty.findById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente inserir(@RequestBody Cliente cliente){
        return clienteRepositoty.save(cliente);
    }
}
