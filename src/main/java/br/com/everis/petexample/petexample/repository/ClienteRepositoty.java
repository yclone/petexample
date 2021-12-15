package br.com.everis.petexample.petexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.everis.petexample.petexample.model.Cliente;

@Repository
public interface ClienteRepositoty extends JpaRepository<Cliente, Long>{
    
}
