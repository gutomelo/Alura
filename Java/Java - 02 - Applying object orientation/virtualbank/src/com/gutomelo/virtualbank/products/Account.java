package com.gutomelo.virtualbank.products;

import com.gutomelo.virtualbank.users.User;

public class Account {
    private long number;
    private User user;
    private double balanceAccount;
    private LimitAccount LimitAccount;
    //private double balanceLimit;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getHolder() {
        return user.getName();
    }

    public void setHolder(String name) {
        this.user.setName(name);
    }

    public double getBalanceAccount() {
        return balanceAccount;
    }

    public void setBalanceAccount(double balance) {
        this.balanceAccount = balance;
    }

//    public double getLimitAccount() {
//        return LimitAccount;
//    }

    public void setLimitAccount(double limitAccount) {
        this.LimitAccount.setLimit(limitAccount);
        this.LimitAccount.setBalanceLimit(limitAccount);
    }

//    public double getBalanceLimit() {
//        return balanceLimit;
//    }

    public void setAccount(long number, User user, double balanceAccount, double limit, double balanceLimit){
        this.number = number;
        this.user = user;
        this.balanceAccount = balanceAccount;
        this.LimitAccount.setLimit(limit);
        this.LimitAccount.setBalanceLimit(balanceLimit);
    }

    public void getClient(){
        System.out.println("Number: " + number + ", Holder: " + user.getName() + ", Balance Account: $ " + balanceAccount + ", Limit Account: $ " + LimitAccount.getLimit() + ", Balance Limit: $ " + LimitAccount.getBalanceLimit());
    }

    public void withDraw(double value){
        System.out.println("Withdrawal of: $ " + value);

        if (value < this.balanceAccount){
            this.balanceAccount -= value;
            System.out.println("Withdrawal allowed.");
        }
        else if (value > this.balanceAccount && value < this.balanceAccount + this.LimitAccount.getLimit()) {
            this.balanceAccount -= value;
            this.LimitAccount.setBalanceLimit(this.LimitAccount.getBalanceLimit() - this.balanceAccount);
            System.out.println("Withdrawal allowed, but reached the account limit.");
        }
        else {
            System.out.println("Withdrawal not allowed.");
        }

    }

    public void deposit(double value){
        if (this.balanceAccount < 0 && value + this.balanceAccount < 0){
            this.balanceAccount += value;
        } else if (this.balanceAccount < 0 && value + this.balanceAccount > 0) {
            this.LimitAccount.setBalanceLimit(this.LimitAccount.getBalanceLimit() -this.balanceAccount);
            this.balanceAccount += value;
        }else {
            this.balanceAccount += value;
        }


        this.LimitAccount.setBalanceLimit(this.LimitAccount.getBalanceLimit() + value);
        System.out.println("Deposit made of: $ " + value);
    }

    public void transfer(Account account, double value){
        this.balanceAccount = this.balanceAccount - value;
        account.balanceAccount += value;
    }
}
