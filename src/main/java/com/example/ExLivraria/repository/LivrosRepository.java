package com.example.ExLivraria.repository;

import com.example.ExLivraria.model.Livros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrosRepository extends JpaRepository <Livros, Integer> {
}
