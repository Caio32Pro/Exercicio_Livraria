package com.example.ExLivraria.controller;

import com.example.ExLivraria.model.Livros;
import com.example.ExLivraria.repository.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/apiAluno")
public class LivroControl {

    @Autowired
    LivrosRepository bookRepo;

    @GetMapping(value = "todos")
    public List<Livros> listaLivros(){
        return bookRepo.findAll();
    }
}
