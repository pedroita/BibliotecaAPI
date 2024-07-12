package com.livros.biblioteca.livro;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table (name = "Livro")
@Entity (name = "livro")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Livro {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String editora;
	private int quantidade ;
	private String edicao ;
	
	@Enumerated(EnumType.STRING)	
	private Categoria categoria;
	@Enumerated(EnumType.STRING)	
	private Idioma idioma;
	
public Livro(DadosCadastroLivros dados) {
		this.categoria = dados.categoria();
		this.nome = dados.nome();
		this.editora = dados.editora();
		this.idioma = dados.idioma();
		this.categoria = dados.categoria();
		this.quantidade = dados.quantidade();
		this.edicao = dados.edicao();
		
	}
}
