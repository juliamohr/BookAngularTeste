package com.crud.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.book.model.Livro;
import com.crud.book.service.LivroService;



@RestController
@RequestMapping("/livro")
public class LivroController {

	@Autowired
	private LivroService service;
	
	@PostMapping
	public ResponseEntity<Livro> addLivro (@RequestBody Livro livro){
		Livro newlivro = service.addLivro(livro);
		return new ResponseEntity<> (newlivro, HttpStatus.CREATED);
		
	}
	
	@PutMapping
	
	public ResponseEntity<Livro> updateLivro(@RequestBody Livro livro){
		Livro newlivro = service.uptadeLivro(livro);
		return new ResponseEntity<> (newlivro, HttpStatus.OK); 
	}
	
	 @GetMapping()
	   public ResponseEntity<List<Livro>> listarLivro(){ 
	    List<Livro> listar = service.findAll();
	        return new ResponseEntity<>(listar, HttpStatus.OK);
}
	 @GetMapping("{id}")
	    public ResponseEntity<List<Livro>> listarBookId(@PathVariable("id") Double id){
	        List<Livro> books = service.findLivroById(id);
	        return new ResponseEntity<>(books, HttpStatus.OK);
	    }
	 @DeleteMapping("{id}")
	    public void deletar(@PathVariable("id") Double id){
	         service.deleteLivro(id);
	    }
}
	 

