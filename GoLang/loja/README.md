# Projeto Loja - Golang com SQLite

Este projeto é uma aplicação web de uma loja desenvolvida em Go (Golang), utilizando o banco de dados SQLite. O projeto foi desenvolvido com base no curso [Go Lang: Desenvolvendo aplicações web com Go](https://cursos.alura.com.br/course/go-lang-web) da Alura.

## Tecnologias Utilizadas

- **Linguagem**: Go (Golang)
- **Banco de Dados**: SQLite
- **Framework Web**: `net/http` nativo do Go

## Funcionalidades

- Cadastro de produtos
- Listagem de produtos
- Edição de produtos
- Remoção de produtos

## Pré-requisitos

- Go instalado (versão 1.18 ou superior)
- [SQLite](https://www.sqlite.org/download.html) instalado

## Estrutura do Projeto
.
├── main.go            # Arquivo principal da aplicação
├── models             # Contém as definições de modelos e interação com o banco de dados
│   └── produto.go     # Modelo do produto e funções de interação com o banco
├── controllers        # Contém os controladores que gerenciam as rotas e a lógica de negócios
│   └── produto.go     # Controlador para gerenciar as operações de produto
├── templates          # Templates HTML para renderização das páginas
│   ├── index.html     # Página principal que lista os produtos
│   ├── edit.html      # Formulário para cadastrar e editar produtos
│   └── new.html       # Formulário para criação de um novo produto
├── db/loja.db         # Banco de dados SQLite
├── go.mod             # Arquivo de dependências do Go
└── README.md          # Documentação do projeto



