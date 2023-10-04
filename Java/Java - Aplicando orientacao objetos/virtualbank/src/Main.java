import com.gutomelo.virtualbank.products.CheckingAccount;

public class Main {
    public static void main(String[] args) {
        CheckingAccount myaccount = new CheckingAccount();
        myaccount.setNumber(12345);
        myaccount.setHolder("Guto Melo");
        myaccount.setBalanceAccount(100);
        myaccount.setLimit(60);

        myaccount.getClient();
        myaccount.withDraw(150);
        myaccount.getClient();
        myaccount.deposit(40);
        myaccount.getClient();

    }
}