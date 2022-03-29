package com.metasSpring.proyect_metas.controllers;

import com.metasSpring.proyect_metas.dao.TareaRepository;
import com.metasSpring.proyect_metas.models.Tareas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    @Autowired
    private TareaRepository tareaRepository;


    @GetMapping
    public ResponseEntity<Page<Tareas>> listarTareas(Pageable pageable){
        return ResponseEntity.ok(tareaRepository.findAll(pageable));

    }

    @GetMapping("/{id}")
    public ResponseEntity<Tareas> obtenerTareaPorId(@PathVariable Integer id){
        Optional<Tareas> tareasOptional=tareaRepository.findById(id);

        if (!tareasOptional.isPresent()){
            return ResponseEntity.unprocessableEntity().build();
        }
        return  ResponseEntity.ok(tareasOptional.get());
    }
}
