package com.livros.biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livros.biblioteca.livro.DadosCadastroLivros;
import com.livros.biblioteca.livro.Livro;
import com.livros.biblioteca.livro.LivroReposytory;

@RestController
@RequestMapping("/livro")
public class LivroController {
	@Autowired
	LivroReposytory reposytory;
	@PostMapping
	public void cadastraLivros( @RequestBody @Validated DadosCadastroLivros dados) {
		reposytory.save(new Livro(dados));
	}
}
