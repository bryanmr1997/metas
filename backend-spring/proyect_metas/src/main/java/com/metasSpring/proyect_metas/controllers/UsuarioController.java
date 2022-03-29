package com.metasSpring.proyect_metas.controllers;


import com.metasSpring.proyect_metas.dao.UsuarioRepository;
import com.metasSpring.proyect_metas.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    //Obtener todos los usuarios

    @GetMapping
    public ResponseEntity<Page<Usuario>> listarUsuarios(Pageable pageable){
        return  ResponseEntity.ok(usuarioRepository.findAll(pageable));
    }



    //Guardar Usuario
    @PostMapping
    public ResponseEntity<Usuario> guardarUsuario( @RequestBody Usuario usuario){

        Usuario usuarioGuardado= usuarioRepository.save(usuario);
        URI ubicacion = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(usuarioGuardado.getId_usuario()).toUri();
        return ResponseEntity.created(ubicacion).body(usuarioGuardado);
    }

    //Falta Actualizar,Eliminar

    //Obtener un usuario
    @GetMapping
    public ResponseEntity<Usuario> obtenerUsuarioPorId(@PathVariable Integer id){

        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);
        if (!usuarioOptional.isPresent()){
            return ResponseEntity.unprocessableEntity().build();
        }


        return ResponseEntity.ok(usuarioOptional.get());

    }
}
