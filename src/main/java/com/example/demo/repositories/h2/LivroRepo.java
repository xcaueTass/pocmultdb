package com.example.demo.repositories.h2;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.h2.Livro;

/**
 * 
 * @author xcaue
 * @apiNote - Config entidade BD h2
 * 
 */
public interface LivroRepo extends JpaRepository<Livro, Integer> {

}
