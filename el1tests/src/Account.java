import java.io.Serializable;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public int credit(int amount) {
        balance += amount;
        return balance;
    }
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            return Integer.parseInt("Amount exceeded balance");
        }
        return balance;}
    public Serializable transferTo(Account another,int amount) {
        if (amount <= balance) {
            another.balance=another.balance+amount;
            return balance-amount;
        }else {
            return "Amount exceeded balance";
        }
    }
    public String toString(){
        return "Account[id= "+id+",name= "+name+",balance= "+balance+"]";
    }}