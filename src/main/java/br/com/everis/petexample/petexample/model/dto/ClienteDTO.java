package br.com.everis.petexample.petexample.model.dto;

import javax.persistence.Column;
import lombok.Data;

@Data
public class ClienteDTO {

    private long id;
    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sobrenome;
    
}
