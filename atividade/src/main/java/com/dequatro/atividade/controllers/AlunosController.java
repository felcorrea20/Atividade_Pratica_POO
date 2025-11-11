package com.dequatro.atividade.controllers;

import com.dequatro.atividade.models.Alunos;
import com.dequatro.atividade.services.AlunosService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/alunos")
public class AlunosController {

    @Autowired
    private AlunosService alunosService;

    @PostMapping (path = "/criar")
    @Operation (summary = "Cria aluno")
    public Alunos criarAluno (@RequestBody Alunos aluno) {
        return alunosService.criarAluno (aluno);
    }

    @GetMapping (path = "/src/{id}")
    @Operation (summary = "Procura aluno")
    public Optional<Alunos> procurarAluno (@PathVariable Long id) {
        return alunosService.procurarAluno(id);
    }

    @GetMapping (path = "/src")
    @Operation (summary = "Lista alunos")
    public List<Alunos> listAll () {
        return alunosService.listAll();
    }

    @PutMapping (path = "/edit/{id}")
    @Operation (summary = "Edita aluno")
    public Alunos editar (@PathVariable Long id, @RequestBody Alunos aluno) {
        return alunosService.editar (id, aluno);
    }

    @DeleteMapping (path = "/delete/{id}")
    @Operation (summary = "Exclui aluno")
    public void delete (@PathVariable Long id) {
        alunosService.delete (id);
    }
}
