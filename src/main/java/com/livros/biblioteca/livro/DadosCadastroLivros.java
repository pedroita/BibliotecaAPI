package com.livros.biblioteca.livro;

import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroLivros(
		
		@NotBlank
		String nome,
		@NotBlank
		String editora,
		
		int quantidade ,
		@NotBlank
		String edicao ,
		@Enumerated
		Categoria categoria,
		@Enumerated
		Idioma idioma
		
		) {

}
