package com.livros.biblioteca.livro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroReposytory extends JpaRepository<Livro, Long> {

}
