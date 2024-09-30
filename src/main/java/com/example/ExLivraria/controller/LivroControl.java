package com.example.ExLivraria.controller;

import com.example.ExLivraria.model.Livros;
import com.example.ExLivraria.repository.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/apiLivros")
public class LivroControl {

    @Autowired
    LivrosRepository bookRepo;

    @GetMapping(value = "/todos")
    public List<Livros> listaLivros(){
        return bookRepo.findAll();
    }

    @GetMapping("/livros/{IdLivro}")
    public Optional<Livros> buscarLivrosPorId(@PathVariable(value = "IdLivro") int IdLivro){
        return bookRepo.findById(IdLivro);
    }

    @PostMapping("/cadastrarLivro")
    public void culturaDeGraca(@RequestBody Livros book){
        bookRepo.save(book);
    }

    @DeleteMapping("/excluirLivros")
    public void censuraGratuita(@RequestBody Livros book){
        bookRepo.delete(book);
    }

    @DeleteMapping("/excluirId/{IdLivro}")
    public void censuraGratuitaPorId(@PathVariable(value = "IdLivro") int IdLivro){
        bookRepo.deleteById(IdLivro);
    }

    @PutMapping("/atualizar")
    public void atualizarLivros(@RequestBody Livros book){
        bookRepo.save(book);
    }

}
