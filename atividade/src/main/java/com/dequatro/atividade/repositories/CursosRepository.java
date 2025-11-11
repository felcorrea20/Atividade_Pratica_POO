package com.dequatro.atividade.repositories;

import com.dequatro.atividade.models.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursosRepository extends JpaRepository<Cursos, Long> {
}
