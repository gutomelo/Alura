package main

import (
	"net/http"

	"loja/routes"
)

func main() {
	routes.CarregaRotas()
	http.ListenAndServe(":8010", nil)
}
