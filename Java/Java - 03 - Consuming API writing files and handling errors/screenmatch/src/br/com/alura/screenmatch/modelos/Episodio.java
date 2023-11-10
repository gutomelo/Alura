package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizaoes;

    public int getTotalVisualizaoes() {
        return totalVisualizaoes;
    }

    public void setTotalVisualizaoes(int totalVisualizaoes) {
        this.totalVisualizaoes = totalVisualizaoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizaoes > 100){
            return 4;
        } else {
            return 2;
        }
    }
}
