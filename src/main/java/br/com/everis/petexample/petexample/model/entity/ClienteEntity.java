package br.com.everis.petexample.petexample.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "clientes")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
