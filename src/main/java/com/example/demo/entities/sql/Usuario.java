package com.example.demo.entities.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author xcaue
 * @apiNote - Config entidade BD SQL
 * 
 */
@Entity
@Table(name = "Usuario")
public class Usuario {

	@Id
	private int id;

	@Column(name = "user")
	private String user;

}
