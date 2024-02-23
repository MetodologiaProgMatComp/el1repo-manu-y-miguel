package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Account;

public class Account {

    private String id;

    private String name;

    private int balance = 0;

    public  Account(String ID, String NAME) {
        id=ID;
        name=NAME;
    }
    public Account(String ID, String NAME, int Balance) {

        id=ID;
        name=NAME;
        balance=Balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance-= amount;
        } else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public String toString() {
        return "Account[id="+  id + ", name=" + name + ", balance=" + balance + "]";
    }
}
