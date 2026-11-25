package com.pluralsight;

public class SavingsAccount implements BankAccount {
    private double balance;
    private static double interestRate = 0.033;

    public SavingsAccount(double balance){
        this.balance = Math.max(0.0, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0){
            this.balance += balance;
        }
    }

    @Override
    public double withdraw(double amount) {
        if (amount <= 0){
            return 0.0;
        }
        if (this.balance >= amount){
            this.balance -= amount;
            return amount;
        } else {
            double withdrawAmount = this.balance;
            this.balance = 0.0;
            return withdrawAmount;
        }
    }

    public static double getInterestRate(double rate){
        interestRate = rate;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public double getValue(){
        return this.balance;
    }
}