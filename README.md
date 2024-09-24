# Biblioteca API

Este projeto é uma API para gerenciamento de livros, construída com **Spring Boot**. Ele permite operações como criação, listagem, edição e exclusão de livros, categorizando-os por **idioma** e **categoria**.

## Estrutura do Projeto

Abaixo está a estrutura básica do projeto, separada por pacotes:
├── src │ ├── main │ │ ├── java/com/livros/biblioteca │ │ │ ├── controllers │ │ │ │ ├── HelloWorld.java # Exemplo de um controlador inicial │ │ │ │ ├── LivroController.java # Controlador responsável pelas operações CRUD de livros │ │ │ ├── livro │ │ │ │ ├── Categoria.java # Modelo para a categoria dos livros │ │ │ │ ├── DadosCadastroLivros.java # DTO para cadastro de livros │ │ │ │ ├── Idioma.java # Modelo para o idioma dos livros │ │ │ │ ├── Livro.java # Entidade Livro │ │ │ │ ├── LivroRepository.java # Interface de repositório para persistência de dados dos livros │ │ │ ├── BibliotecaApplication.java # Classe principal que inicializa a aplicação ├── resources # Arquivos de configuração e templates ├── test/java/com/livros/biblioteca # Testes unitários e de integração

## Tecnologias Utilizadas

- **Java 17**: Linguagem principal de desenvolvimento
- **Spring Boot**: Framework para criação de APIs e microsserviços
- **Maven**: Ferramenta de automação de build e gerenciamento de dependências
- **JPA/Hibernate**: Para persistência de dados
- **H2 Database**: Banco de dados em memória (para testes)

## Executando o Projeto

### Pré-requisitos

- JDK 17 ou superior
- Maven 3.x
- IDE como IntelliJ IDEA, Eclipse ou VSCode

### Passos para executar:

1. Clone o repositório:
    ```bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    ```

2. Navegue até o diretório do projeto:
    ```bash
    cd seu-repositorio
    ```

3. Compile o projeto com Maven:
    ```bash
    mvn clean install
    ```

4. Execute a aplicação:
    ```bash
    mvn spring-boot:run
    ```

A aplicação estará disponível em `http://localhost:8080`.

## Endpoints Disponíveis

Aqui estão alguns dos principais endpoints da API:

- `GET /livros` - Retorna a lista de todos os livros
- `POST /livros` - Adiciona um novo livro
- `GET /livros/{id}` - Retorna detalhes de um livro específico
- `PUT /livros/{id}` - Atualiza as informações de um livro
- `DELETE /livros/{id}` - Remove um livro



