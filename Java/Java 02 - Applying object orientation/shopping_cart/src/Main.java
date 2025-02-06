import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the card limit: ");
        double limit = reader.nextDouble();
        CreditCard card = new CreditCard(limit);

        int exit = 1;
        while(exit != 0) {
            System.out.println("Enter the buy description: ");
            String descricption = reader.next();

            System.out.println("Enter the buy value: ");
            double value = reader.nextDouble();

            Buy buy = new Buy(descricption, value);
            boolean purchaseMade = card.launchPurchase(buy);

            if (purchaseMade) {
                System.out.println("Purchase made!");
                System.out.println("Enter 0 to exit or 1 to continue: ");
                exit = reader.nextInt();
            } else {
                System.out.println("Insufficient funds!");
                exit = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("Purchases Made:\n");

        for (Buy c : card.getShopping()) {
            System.out.println(c.getDescription() + " - " +c.getValue());
        }
        System.out.println("\n***********************");

        System.out.println("\nCredit Card Balance: " + card.getBalance());

    }
}