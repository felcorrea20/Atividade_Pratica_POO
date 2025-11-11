package com.dequatro.atividade.controllers;

import com.dequatro.atividade.models.Alunos;
import com.dequatro.atividade.models.Cursos;
import com.dequatro.atividade.services.CursosService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (path = "/cursos")
public class CursosController {

    @Autowired
    private CursosService cursosService;

    @PostMapping(path = "/criar")
    @Operation(summary = "Cria curso")
    public Cursos criarAluno (@RequestBody Cursos curso) {
        return cursosService.criarCurso (curso);
    }

    @GetMapping (path = "/src/{id}")
    @Operation(summary = "Procura curso")
    public Optional<Cursos> procurarCurso (@PathVariable Long id) {
        return cursosService.procurarCurso (id);
    }

    @GetMapping (path = "/src")
    @Operation(summary = "Lista cursos")
    public List<Cursos> listAll () {
        return cursosService.listAll();
    }

    @PutMapping (path = "/edit/{id}")
    @Operation(summary = "Edita curso")
    public Cursos editar (@PathVariable Long id, @RequestBody Cursos curso) {
        return cursosService.editar (id, curso);
    }

    @DeleteMapping (path = "/delete/{id}")
    @Operation(summary = "Exclui curso")
    public void delete (@PathVariable Long id) {
        cursosService.delete (id);
    }
}