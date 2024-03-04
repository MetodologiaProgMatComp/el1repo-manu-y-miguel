package classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Customer2 cust = new Customer2(2,"Shinji",'m');
        Account acc = new Account(2,cust,1000);
        assertEquals(acc.getId(),2);
    }

    @Test
    void getCustomer() {
        Customer2 cust = new Customer2(2,"Shinji",'m');
        Account acc = new Account(2,cust,1000);
        assertEquals(acc.getCustomer(),cust);
    }

    @Test
    void getBalance() {
        Customer2 cust = new Customer2(2,"Shinji",'m');
        Account acc = new Account(2,cust,1000);
        assertEquals(acc.getBalance(),1000);
    }

    @Test
    void setBalance() {
        Customer2 cust = new Customer2(2,"Shinji",'m');
        Account acc = new Account(2,cust,1000);
        acc.setBalance(500);
        assertEquals(acc.getBalance(),500);
    }

    @Test
    void getCustomerName() {
        Customer2 cust = new Customer2(2,"Shinji",'m');
        Account acc = new Account(2,cust,1000);
        String cname = acc.getCustomerName();
        assertEquals("Shinji",cname);
    }

    @Test
    void testToString() {
        Customer2 cust = new Customer2(2,"Shinji",'m');
        Account acc = new Account(2,cust,1000);
        assertEquals("id:2, Shinji(2),balance= 1000.0", acc.toString());
    }

    @Test
    void deposit() {
        Customer2 cust = new Customer2(2,"Shinji",'m');
        Account acc = new Account(2,cust,1000);
        acc.deposit(500);
        assertEquals(acc.getBalance(),1500);
    }

    @Test
    void withdraw() {
        Customer2 cust = new Customer2(2,"Shinji",'m');
        Account acc = new Account(2,cust,1000);
        acc.withdraw(400);
        assertEquals(600,acc.getBalance());
    }
}