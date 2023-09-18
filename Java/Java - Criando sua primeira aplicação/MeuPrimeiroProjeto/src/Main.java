public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o ScreenMatch!");
        System.out.println("Filme: Top Gun Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notadoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Média: " + media);

        String resumo, sinopse;
        resumo = "Filme com galã dos anos 80";
        sinopse = """
                \nFilme - Top Gun maverick
                É um Filme muito bom de assistir!
                Tom Cruise manja dos paranaue.
                """;
        System.out.println("Resumdo do Filme: " + resumo);
        System.out.println("Sinopse do Filme: " + sinopse);

        // Fazendo Casting
        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println("Classificação: " + classificacao);

    }
}