package com.example.demo.entities.h2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author xcaue
 * @apiNote - Config entidade BD h2
 * 
 */
@Entity
@Table(name = "livro")
public class Livro {

	@Id
	private int idL;

	@Column(name = "name")
	private String nome;
}
