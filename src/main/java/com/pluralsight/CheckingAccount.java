package com.pluralsight;

public class CheckingAccount implements BankAccount {
    private double balance;

    public CheckingAccount(double balance){
        this.balance = Math.max(0.0, balance);
    }

    @Override
    public void deposit(double amount){
        if (amount >0){
            this.balance += amount;
        }
    }

    @Override
    public double withdraw(double amount){
        if (amount <= 0){
            return 0.0;
        }
        if (this.balance >= amount){
            this.balance -= amount;
            return  amount;
        } else {
            double withdrawAmount = this.balance;
            this.balance = 0.0;
            return withdrawAmount;
        }
    }

    @Override
    public double getBalance(){
        return this.balance;
    }

    @Override
    public double getValue(){
        return this.balance;
    }
}