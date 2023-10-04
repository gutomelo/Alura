package com.gutomelo.virtualbank.products;

public class CheckingAccount {
    private long number;
    private String holder;
    private double balanceAccount;
    private double limit;
    private double balanceLimit;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalanceAccount() {
        return balanceAccount;
    }

    public void setBalanceAccount(double balance) {
        this.balanceAccount = balance;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
        this.balanceLimit = limit;
    }

    public double getBalanceLimit() {
        return balanceLimit;
    }

    public void getClient(){
        System.out.println("Number: " + number + ", Holder: " + holder + ", Balance Account: $ " + balanceAccount + ", Limit Account: $ " + limit + ", Balance Limit: $ " + balanceLimit);
    }

    public void withDraw(double value){
        if (value < this.balanceAccount){
            this.balanceAccount -= value;
            System.out.println("Withdrawal allowed.");
        }
        else if (value > this.balanceAccount && value < this.balanceAccount + this.limit ) {
            this.balanceAccount -= value;
            this.balanceLimit -= -this.balanceAccount;
            System.out.println("Withdrawal allowed, but reached the account limit.");
        }
        else {
            System.out.println("Withdrawal not allowed.");
        }

        System.out.println("Withdrawal of: $ " + value);
    }

    public void deposit(double value){
        if (this.balanceAccount < 0 && value + this.balanceAccount < 0){
            this.balanceAccount += value;
        } else if (this.balanceAccount < 0 && value + this.balanceAccount > 0) {
            this.balanceLimit += -this.balanceAccount;
            this.balanceAccount += value;
        }else {
            this.balanceAccount += value;
        }


        this.balanceLimit += value;
        System.out.println("Deposit made of: $ " + value);
    }
}
