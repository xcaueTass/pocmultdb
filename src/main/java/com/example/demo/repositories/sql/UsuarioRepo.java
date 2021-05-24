package com.example.demo.repositories.sql;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.sql.Usuario;

/**
 * 
 * @author xcaue
 * @apiNote - Config entidade BD SQL
 * 
 */
public interface UsuarioRepo extends JpaRepository<Usuario, Integer> {

}
