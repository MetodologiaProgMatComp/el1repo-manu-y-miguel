package classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void getId() {
        Customer cust = new Customer(1,"Josh",20);
        Invoice inv = new Invoice(2,cust,10);
        int id = inv.getId();
        assertEquals(2,id);
    }

    @Test
    void getCustomer() {
        Customer cust = new Customer(1,"Josh",20);
        Invoice inv = new Invoice(2,cust,10);
        Customer cus = inv.getCustomer();
        assertEquals(cust,cus);
    }

    @Test
    void setCustomer() {
        Customer cust = new Customer(1,"Josh",20);
        Invoice inv = new Invoice(2,cust,10);
        Customer cust2 = new Customer(2,"Jhon",10);
        inv.setCustomer(cust2);
        assertEquals(inv.getCustomer(),cust2);
    }

    @Test
    void getAmount() {
        Customer cust = new Customer(1,"Josh",20);
        Invoice inv = new Invoice(2,cust,10);
        double am = inv.getAmount();
        assertEquals(10,am);
    }

    @Test
    void setAmount() {
        Customer cust = new Customer(1,"Josh",20);
        Invoice inv = new Invoice(2,cust,10);
        inv.setAmount(30);
        assertEquals(inv.getAmount(),30);
    }

    @Test
    void getCustomerId() {
        Customer cust = new Customer(1,"Josh",20);
        Invoice inv = new Invoice(2,cust,10);
        int cid = inv.getCustomerId();
        assertEquals(1,cid);
    }

    @Test
    void getCustomerName() {
        Customer cust = new Customer(1,"Josh",20);
        Invoice inv = new Invoice(2,cust,10);
        String cname = inv.getCustomerName();
        assertEquals("Josh",cname);
    }

    @Test
    void getCustomerDiscount() {
        Customer cust = new Customer(1,"Josh",20);
        Invoice inv = new Invoice(2,cust,10);
        int cdis = inv.getCustomerDiscount();
        assertEquals(20,cdis);
    }

    @Test
    void getAmountAfterDiscount() {
        Customer cust = new Customer(1,"Josh",20);
        Invoice inv = new Invoice(2,cust,10);
        assertEquals(inv.getAmountAfterDiscount(),8);
    }

    @Test
    void testToString() {
        Customer cust = new Customer(1,"Josh",20);
        Invoice inv = new Invoice(2,cust,10);
        assertEquals(inv.toString(), "Invoice[id= 2,nameJosh(1)(20%),amount= 8.0]");
    }
}