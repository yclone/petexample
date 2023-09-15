package br.com.everis.petexample.petexample.repository;

import br.com.everis.petexample.petexample.model.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositoty extends JpaRepository<ClienteEntity, Long>{

    ClienteEntity findByUsername(String username);
    ClienteEntity findByEmail(String email);

    boolean existsByEmail(String email);
}
