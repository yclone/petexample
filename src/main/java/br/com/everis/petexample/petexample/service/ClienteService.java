package br.com.everis.petexample.petexample.service;

import br.com.everis.petexample.petexample.model.entity.ClienteEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    ClienteEntity save(ClienteEntity any);

    List<ClienteEntity> getAllUsers();

    Optional<ClienteEntity> getUserById(Long id);

    ResponseEntity<ClienteEntity> updateUser(Long id, ClienteEntity clienteEntity);
}
