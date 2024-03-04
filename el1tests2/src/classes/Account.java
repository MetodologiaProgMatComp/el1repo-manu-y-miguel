package classes;

import java.io.Serializable;

public class Account {
    private int id;
    private Customer2 customer;
    private double balance=0.0;
    public Account(int id,Customer2 customer,double balance){
        this.id=id;
        this.customer=customer;
        this.balance=balance;}
    public Account(int id,Customer2 customer){
        this.id=id;
        this.customer=customer;}
    public int getId() {return id;}
    public Customer2 getCustomer() {return customer;}
    public double getBalance() {return balance;}
    public void setBalance(double balance) {this.balance = balance;}
    public String getCustomerName(){
        return customer.getName();}
    public String toString(){
        return String.format("id:"+id+", "+customer.getName() + "(" + id + "),balance= " + balance, "%03d.%02d");}
    public double deposit(double amount){
        return balance+=amount;
    }
    public Serializable withdraw(double amount){
        if (balance< amount)
        {
            return "Account acc1 = new Account(2,cust,1000)";
        }else{
        return balance -= amount;
}
    }
}
