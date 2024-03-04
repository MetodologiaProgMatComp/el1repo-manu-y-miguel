package classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getDiscount() {
        Customer cust = new Customer(1,"Josh",20);
        int disc = cust.getDiscount();
        assertEquals(20,disc);
    }

    @Test
    void getName() {
        Customer cust = new Customer(1,"Josh",20);
        String name = cust.getName();
        assertEquals("Josh",name);
    }

    @Test
    void getId() {
        Customer cust = new Customer(1,"Josh",20);
        int id = cust.getId();
        assertEquals(1,id);
    }

    @Test
    void setDiscount() {
        Customer cust = new Customer(1,"Josh",20);
        cust.setDiscount(10);
        int disc = cust.getDiscount();
        assertEquals(disc, 10);
    }

    @Test
    void testToString() {
        Customer cust = new Customer(1,"Josh",20);
        assertEquals("nameJosh(1)(20%)",cust.toString());
    }
}