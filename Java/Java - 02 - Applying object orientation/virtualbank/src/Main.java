import com.gutomelo.virtualbank.products.Account;
import com.gutomelo.virtualbank.users.User;

public class Main {
    public static void main(String[] args) {
        User myUser = new User();
        Account myAccount = new Account();
        myUser.setHolder(1,"Guto Melo", 12345678909L);
        myAccount.setAccount(12345, myUser, 100, 60, 60);


        myAccount.getClient();
        myAccount.withDraw(150);
        myAccount.getClient();
        myAccount.deposit(40);
        myAccount.getClient();

    }
}