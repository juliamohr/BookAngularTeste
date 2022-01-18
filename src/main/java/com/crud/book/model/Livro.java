package com.crud.book.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.logging.log4j.util.StringBuilderFormattable;

@Entity
public class Livro implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (nullable = false, updatable = false)
	private Long id;
	private String nome;
	private String sinopse;
	private String autor;
	private Double preço;
	private String genero;
	private String imageUrl;
	
	public Livro(Long id, String nome, String sinopse, String autor, Double preço, String genero, String imageUrl) {
		super();
		this.id = id;
		this.nome = nome;
		this.sinopse = sinopse;
		this.autor = autor;
		this.preço = preço;
		this.genero = genero;
		this.imageUrl = imageUrl;
	}

	public Livro() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
	
	
	