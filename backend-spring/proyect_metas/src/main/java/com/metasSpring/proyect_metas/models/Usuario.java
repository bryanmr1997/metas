package com.metasSpring.proyect_metas.models;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    private String nombre;
    private Integer edad;
    private String password;


}
