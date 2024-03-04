package classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Customer2Test {

    @Test
    void getId() {
        Customer2 cust2 = new Customer2(2,"Shinji",'m');
        assertEquals(cust2.getId(),2);
    }

    @Test
    void getName() {
        Customer2 cust2 = new Customer2(2,"Shinji",'m');
        assertEquals(cust2.getName(),"Shinji");
    }

    @Test
    void getGender() {
        Customer2 cust2 = new Customer2(2,"Shinji",'m');
        assertEquals(cust2.getGender(),'m');
    }

    @Test
    void testToString() {
        Customer2 cust2 = new Customer2(2,"Shinji",'m');
        assertEquals(cust2.toString(),"Shinji(2)(m)");
    }
}