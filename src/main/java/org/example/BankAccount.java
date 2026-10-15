package org.example;
/*
Exercise 4.2: Bank account
Create a BankAccount class with private fields for account holder, account number, and balance.
Add a constructor and methods: - deposit(double amount) - withdraw(double amount) - getBalance()

A deposit or withdrawal must be greater than zero. A withdrawal cannot exceed the balance.
Invalid operations must not change the balance. Test valid and invalid transactions.
 */
public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String _accountHolder, String _accountNumber, double _balance){
        accountHolder = _accountHolder;
        accountNumber = _accountNumber;
        balance = _balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
        }
    }

    public double getBalance(){
        return balance;
    }
}
