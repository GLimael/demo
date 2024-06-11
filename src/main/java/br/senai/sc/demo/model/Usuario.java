package br.senai.sc.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

//@Getter
@ToString

@Entity
@Table(name = "tb_usuario")
public class Usuario {
    @Getter
    @Column(nullable = false)
    private String nome;
    @Column(unique = true)
    private String email;
    @ToString.Exclude
    @Column(name = "password")
    private String senha;
    @ToString.Exclude
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(precision = 11, unique = true, updatable = false)
    private Long cpf;
    @Column(length = 50)
    private String nomePet; //No banco de dados seria nome_pet

}