package com.pluralsight;

public interface BankAccount {
    void deposit(double amount);
    double withdraw(double amount);
    double getBalance();

    double getValue();
}
