package br.senai.sc.demo.model;

import jakarta.persistence.*; //data jpa
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString

@Entity
@Table(name = "tb_usuario")
public class Usuario {
    @Column(nullable = false)
    private String nome;
    @Column(unique = true)
    private String email;
    @ToString.Exclude
    @Column(name = "password")
    private String senha;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(precision = 11, unique = true, updatable = false)
    private Long cpf;
    @Column(length = 50)
    private String nomePet; //No banco de dados seria nome_pet

}