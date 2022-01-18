package com.crud.book.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.book.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Double> {
	
	List<Livro> findLivroById(Double id);

	List<Livro> findLivroByNome (String nome);
	
	List<Livro> findLivroByAutor (String autor);
}
