package com.dequatro.atividade.services;

import com.dequatro.atividade.models.Alunos;
import com.dequatro.atividade.repositories.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunosService {

    @Autowired
    private AlunosRepository alunosRepository;

    public Alunos criarAluno(Alunos aluno) {
        return alunosRepository.save(aluno);
    }

    public Optional<Alunos> procurarAluno(Long id) {
        return alunosRepository.findById(id);
    }

    public List<Alunos> listAll() {
        return alunosRepository.findAll();
    }

    public Alunos editar(Long id, Alunos aluno) {
        Alunos aln = alunosRepository.findById(id).get();

        aln.setNome(aluno.getNome());
        aln.setMatricula(aluno.getMatricula());
        aln.setStatusAluno(aluno.getStatusAluno());
        aln.setCursos(aluno.getCursos());

        return alunosRepository.save(aln);
    }

    public void delete(Long id) {
        alunosRepository.deleteById(id);
    }
}
