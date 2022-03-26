package com.metasSpring.proyect_metas.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Tareas {


    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    private Long id_tarea;
    private String nombre;
    private String meta;
    private Date fecha_meta;

}
