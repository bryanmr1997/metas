package com.metasSpring.proyect_metas.dao;

import com.metasSpring.proyect_metas.models.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends JpaRepository<Tareas, Integer> {
}
