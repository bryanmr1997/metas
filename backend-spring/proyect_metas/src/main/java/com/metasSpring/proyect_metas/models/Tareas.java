package com.metasSpring.proyect_metas.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tareas",uniqueConstraints = {@UniqueConstraint(columnNames = {"nombre"})})
public class Tareas {


    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    private Integer id_tarea;
    private String nombre;
    private String meta;
    private Date fecha_meta;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "usuario_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Usuario usuario;

    public Integer getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(Integer id_tarea) {
        this.id_tarea = id_tarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public Date getFecha_meta() {
        return fecha_meta;
    }

    public void setFecha_meta(Date fecha_meta) {
        this.fecha_meta = fecha_meta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
