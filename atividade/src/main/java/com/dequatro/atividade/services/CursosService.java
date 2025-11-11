package com.dequatro.atividade.services;

import com.dequatro.atividade.models.Alunos;
import com.dequatro.atividade.models.Cursos;
import com.dequatro.atividade.repositories.CursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursosService {

    @Autowired
    private CursosRepository cursosRepository;

    public Cursos criarCurso(Cursos curso) {
        return cursosRepository.save(curso);
    }

    public Optional<Cursos> procurarCurso(Long id) {
        return cursosRepository.findById(id);
    }

    public List<Cursos> listAll() {
        return cursosRepository.findAll();
    }

    public Cursos editar(Long id, Cursos curso) {
        Cursos cu = cursosRepository.findById(id).get();

        cu.setNome(curso.getNome());
        cu.setCargaHoraria(curso.getCargaHoraria());
        cu.setAlunos(curso.getAlunos());

        return cursosRepository.save(cu);
    }

    public void delete(Long id) {
        cursosRepository.deleteById(id);
    }
}
