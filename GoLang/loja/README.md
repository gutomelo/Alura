# Projeto Loja - Golang com SQLite

Este repositório contém uma aplicação web de uma loja, desenvolvida em Go (Golang) e utilizando o banco de dados SQLite com template HTML em Bootstrap. A aplicação permite realizar operações CRUD (Create, Read, Update, Delete) para gerenciar produtos. O projeto foi desenvolvido como parte do curso [Go Lang: Desenvolvendo aplicações web com Go](https://cursos.alura.com.br/course/go-lang-web) da Alura.


## Tecnologias Utilizadas

- **Linguagem**: Go (Golang)
- **Banco de Dados**: SQLite
- **Framework Web**: `net/http` nativo do Go


## Arquitetura

Este projeto segue a arquitetura MVC (Model-View-Controller):

- **Model (Modelo)**: Responsável pela definição das estruturas de dados e pela interação com o banco de dados. Em `models/produto.go`, estão as definições e métodos para manipular os dados dos produtos no banco de dados SQLite.
  
- **View (Visão)**: Utiliza templates HTML para renderizar as páginas da aplicação, fornecendo uma interface amigável ao usuário. As views estão localizadas no diretório `templates` e utilizam o Bootstrap via CDN para estilização e responsividade.

- **Controller (Controlador)**: Controla a lógica de negócios e responde às requisições HTTP, interagindo com os models e renderizando as views. Os controladores estão localizados no diretório `controllers` e são responsáveis por lidar com as rotas da aplicação.

Essa separação permite uma melhor organização do código, facilitando a manutenção e a evolução da aplicação.


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
- ├── main.go            # Arquivo principal da aplicação
- ├── models             # Contém as definições de modelos e interação com o banco de dados
- │   └── produto.go     # Modelo do produto e funções de interação com o banco
- ├── controllers        # Contém os controladores que gerenciam as rotas e a lógica de negócios
- │   └── produto.go     # Controlador para gerenciar as operações de produto
- ├── templates          # Templates HTML para renderização das páginas
- │   ├── index.html     # Página principal que lista os produtos
- │   ├── edit.html      # Formulário para cadastrar e editar produtos
- │   └── new.html       # Formulário para criação de um novo produto
- ├── db/loja.db         # Banco de dados SQLite
- ├── go.mod             # Arquivo de dependências do Go
- └── README.md          # Documentação do projeto
