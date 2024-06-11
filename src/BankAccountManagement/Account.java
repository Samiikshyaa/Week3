package BankAccountManagement;

public class Account{
//    Bank Account Management:
//    Design a Java program to model a bank account system.
//    Implement 2 classes for Account, SavingsAccount, and CurrentAccount.
//    Include methods for deposit, withdrawal, balance inquiry and show account information by account number.
//    Implement inheritance where SavingsAccount and CurrentAccount inherit from the base class Account.
    private String accno;
    private int balance;

    public Account(String accno, int balance) {
        this.accno = accno;
        this.balance = balance;
    }

    int deposit(){
        return 0;
    }
    void withdrawal(int amt){

    }
    int balance(){
        return 0;
    }



}
