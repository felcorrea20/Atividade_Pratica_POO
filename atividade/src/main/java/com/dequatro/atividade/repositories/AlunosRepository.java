package com.dequatro.atividade.repositories;

import com.dequatro.atividade.models.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunosRepository extends JpaRepository<Alunos, Long> {
}
