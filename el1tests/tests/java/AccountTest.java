import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getBalance() {
        Account acc= new Account("7","Walter",9000000);
        assertEquals(9000000, acc.getBalance());
    }

    @Test
    void getName() {
        Account acc= new Account("7","Walter",9000000);
        assertEquals("Walter", acc.getName());
    }

    @Test
    void getId() {
        Account acc= new Account("7","Walter",9000000);
        assertEquals("7", acc.getId());
    }

    @Test
    void credit() {
        Account acc= new Account("7","Walter",9000000);
        int crdt = acc.credit(1000000);
        assertEquals(10000000, crdt);
    }

    @Test
    void debit() {
        Account acc= new Account("7","Walter",9000000);
        int dbt = acc.debit(1000000);
        assertEquals(8000000, dbt);
    }

    @Test
    void transferTo() {
        Account acc= new Account("7","Walter",9000000);
        Account acc2= new Account("2","Jesse",400000);
        int balanc1 = (int) acc.transferTo(acc2,1000000);
        int balanc2 = acc2.getBalance();
        assertEquals(1400000, balanc2);
        assertEquals(8000000, balanc1);
    }

    @Test
    void testToString() {
        Account acc= new Account("7","Walter",9000000);
        assertEquals("Account[id= 7,name= Walter,balance= 9000000]",acc.toString());
    }
}