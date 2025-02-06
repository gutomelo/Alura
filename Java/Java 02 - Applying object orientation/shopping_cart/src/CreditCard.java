import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;
    private List<Buy> shopping;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.shopping = new ArrayList<>();
    }

    public boolean launchPurchase(Buy buy){
        if(this.balance > buy.getValue()){
            this.balance -= buy.getValue();
            this.shopping.add(buy);
            return true;
        }
        return false;
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Buy> getShopping() {
        return shopping;
    }


}
