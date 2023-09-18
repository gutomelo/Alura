import java.util.Random;
import java.util.Scanner;

public class Advinhacao {
    public static void main(String[] args) {
        int aleatorio = new Random().nextInt(20);

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite um número inteiro de advinhação entre 0 e 20, Tentativa %d de 5 tentativas: ", i);
            Scanner leitura = new Scanner(System.in);
            int numero = leitura.nextInt();
            if (numero < aleatorio){
                System.out.println(">> O número é menor que o esperado! <<");
            }
            if (numero > aleatorio) {
                System.out.println(">> O número é maior que o esperado! <<");
            }
            if (numero == aleatorio) {
                System.out.println(">>> VOCÊ ACERTOU O NÚMERO!!! <<<");
                break;
            }
            if (numero == 100) {
                System.out.printf(">>> O NÚMERO é: %d!!! <<<", aleatorio);
                break;
            }
        }
    }
}
