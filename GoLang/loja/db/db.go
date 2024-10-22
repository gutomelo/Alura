package db

import (
	"database/sql"

	_ "github.com/mattn/go-sqlite3"
)

func ConectaComBancoDeDados() *sql.DB {
	conexao := "./db/loja.db"
	db, err := sql.Open("sqlite3", conexao)
	if err != nil {
		panic(err.Error())
	}
	return db
}
