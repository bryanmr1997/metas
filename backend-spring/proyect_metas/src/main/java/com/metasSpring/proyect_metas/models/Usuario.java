package com.metasSpring.proyect_metas.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;
    private String nombre;
    private Integer edad;
    private String password;

    @OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL)
    private Set<Tareas> tareas=new HashSet<>();

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Tareas> getTareas() {
        return tareas;
    }

    public void setTareas(Set<Tareas> tareas) {
        this.tareas = tareas;
        for (Tareas tarea : tareas){
            tarea.setUsuario(this);
        }

    }
}
