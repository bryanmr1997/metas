package com.metasSpring.proyect_metas.services;

import com.metasSpring.proyect_metas.models.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> findByNombreAndPassword(String nombre, String password);
}
