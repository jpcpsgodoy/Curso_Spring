# 📚 Library API – Projeto Spring Boot

API REST desenvolvida em Java com Spring Boot que simula a gestão de uma biblioteca. Permite cadastrar livros, membros, registrar empréstimos, devolver livros, e fazer buscas por título ou autor.


## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Web
- Maven
- Java Streams (filter, map, reduce, etc.)
- Postman (para testes de API)

## 📦 Estrutura da API

-  Book → Livro da biblioteca
-  Member → Pessoa cadastrada como membro
-  BorrowingRecord → Registro de empréstimos

## 📚 Resumo dos Endpoints da Library API
**📘 Livros**

- POST /api/books → Adiciona um novo livro
- GET /api/books → Lista todos os livros
- GET /api/books/title/{title} → Busca um livro pelo título
- GET /api/books/author/{author} → Lista livros por autor

**👤 Membros**

- POST /api/members → Adiciona um novo membro

**📚 Empréstimos**

- POST /api/borrow → Registra um empréstimo de livro
- POST /api/return → Registra a devolução de um livro
