package com.gutomelo.mymusic.principal;

import com.gutomelo.mymusic.modelos.MinhasPreferidas;
import com.gutomelo.mymusic.modelos.Musica;
import com.gutomelo.mymusic.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        // Podcast
        Podcast podcast = new Podcast();
        podcast.setTitulo("Batepapo Java!");
        podcast.setClassificacao(4);
        podcast.setHost("gutomelo.com");
        podcast.setDescricao("Discussão sobre projetos java.");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        // Musica
        Musica musica = new Musica();
        musica.setTitulo("Ana Júlia");
        musica.setClassificacao(7);
        musica.setAlbum("Album Los Hermanos");
        musica.setArtista("Los Hermanos");
        musica.setGenero("Rock");

        for (int i = 0; i < 10000; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 2000; i++) {
            musica.curte();
        }

        //Minhas Preferidas
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);

        // Print Podcast
        System.out.println("*".repeat(99));
        System.out.println("Título do Podcast: " + podcast.getTitulo());
        System.out.println("Host do Podcast: " + podcast.getHost());
        System.out.println("Descrição do Podcast: " + podcast.getDescricao());
        System.out.println("Classificação do Podcast: " + podcast.getClassificacao());
        System.out.println("Total de curtidas do Podcast: " + podcast.getTotalCurtidas());
        System.out.println("Total de reproduções do Podcast: " + podcast.getTotalReproducoes());

        // Print Musica
        System.out.println("*".repeat(99));
        System.out.println("Título da Música: " + musica.getTitulo());
        System.out.println("Album da Música: " + musica.getAlbum());
        System.out.println("Artista da Música: " + musica.getArtista());
        System.out.println("Gênero da Música: " + musica.getGenero());
        System.out.println("Classificação do Música: " + musica.getClassificacao());
        System.out.println("Total de curtidas do Música: " + musica.getTotalCurtidas());
        System.out.println("Total de reproduções do Música: " + musica.getTotalReproducoes());

    }
}
