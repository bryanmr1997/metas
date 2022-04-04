package com.metasSpring.proyect_metas.dao;

import com.metasSpring.proyect_metas.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

    public List<Usuario> findByNombreAndPassword(String nombre, String password);
}
