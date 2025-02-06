import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, esse é meu primeiro programa conversor de temperaturas!");

        // criando um objeto Scanner
        Scanner temperatura = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius para converter para Fahrenheit:\n");
        double scanCelsius = temperatura.nextDouble();
        double tempFar = (scanCelsius * 1.8) + 32;
        String stringFar = String.format("A temperatura em Fahrenheit é: %.2f", tempFar);
        System.out.println(stringFar);

        // Fazendo casting explícito
        int tempFarInt = (int) tempFar;
        System.out.println("A temperatura Fahrenheit em inteiro é: " + tempFarInt);


    }
}