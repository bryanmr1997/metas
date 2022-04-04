package com.metasSpring.proyect_metas.services;

import com.metasSpring.proyect_metas.models.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    @Override
    public List<Usuario> findByNombreAndPassword(String nombre, String password) {
        return null;
    }
}
