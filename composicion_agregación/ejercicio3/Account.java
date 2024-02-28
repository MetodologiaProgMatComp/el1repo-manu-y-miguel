package composicion_agregación.ejercicio3;

import java.io.Serializable;

public class Account {
    private int id;
    private Customer customer;
    private double balance=0.0;
    public Account(int id,Customer customer,double balance){
        this.id=id;
        this.customer=customer;
        this.balance=balance;}
    public Account(int id,Customer customer){
        this.id=id;
        this.customer=customer;}
    public int getId() {return id;}
    public Customer getCustomer() {return customer;}
    public double getBalance() {return balance;}
    public void setBalance(double balance) {this.balance = balance;}
    public String getCustomerName(){
        return customer.getName();}
    public String toString(){
        return String.format(customer.getName() + "(" + id + "),balance= " + balance, "%03d.%02d");}
    public double deposit(double amount){
        return getBalance()+amount;}
    public Serializable withdraw(double amount){
        if (balance>=amount){
            return balance-amount;}else{
            return"Amount withdraw exceeds the current balance!";}}}