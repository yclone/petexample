package br.com.everis.petexample.petexample.controller;

import java.util.List;
import java.util.Optional;

import br.com.everis.petexample.petexample.model.entity.ClienteEntity;
import br.com.everis.petexample.petexample.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.everis.petexample.petexample.model.dto.ClienteDTO;
import br.com.everis.petexample.petexample.repository.ClienteRepositoty;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }
    
    @GetMapping("/list")
    public ResponseEntity<Iterable<ClienteEntity>> findAll() {
        List<ClienteEntity> users = clienteService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ClienteEntity>> getUser(@PathVariable Long id) {
        Optional<ClienteEntity> user = clienteService.getUserById(id);
        if (user.isPresent()){
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/create")
    public ResponseEntity<ClienteEntity> saveProduct(@RequestBody ClienteEntity cliente) {
        return new ResponseEntity<>(clienteService.save(cliente), HttpStatus.CREATED);
    }
}
