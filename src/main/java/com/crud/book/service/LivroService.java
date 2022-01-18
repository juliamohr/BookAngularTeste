package com.crud.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.book.model.Livro;
import com.crud.book.repository.LivroRepository;

import antlr.collections.impl.LList;

@Service
public class LivroService {

	@Autowired
	private LivroRepository repository;
	
	public Livro addLivro (Livro livro) {
		return repository.save(livro);
	}
	
public Livro uptadeLivro (Livro livro) {
	return repository.save(livro);
}

public void deleteLivro (Double id) {
	repository.deleteById(id);
}
public List<Livro> findLivroById(Double id){
	return repository.findLivroById(id);
}

public List<Livro> findLivroByNome (String nome){
	return repository.findLivroByNome(nome);
}

public List<Livro> findLivroByAutor (String autor){
	return repository.findLivroByAutor(autor);
}
public List<Livro> findAll() {
    return repository.findAll();
}
}
