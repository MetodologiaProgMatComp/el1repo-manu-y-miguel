import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem id = new InvoiceItem("2", "Desc", 10, 5);
        assertEquals("2", id.getId());
    }

    @Test
    void getDesc() {
        InvoiceItem id = new InvoiceItem("2", "Desc", 10, 5);
        assertEquals("Desc", id.getDesc());
    }

    @Test
    void getQty() {
        InvoiceItem id = new InvoiceItem("2", "Desc", 10, 5);
        assertEquals(10, id.getQty());
    }

    @Test
    void setQty() {
        InvoiceItem id = new InvoiceItem("2", "Desc", 10, 5);
        assertDoesNotThrow(() -> id.setQty(30));
        int qty = id.getQty();
        assertEquals(30, qty);
    }

    @Test
    void getUnitPrice() {
        InvoiceItem id = new InvoiceItem("2", "Desc", 10, 5);
        assertEquals(5, id.getUnitPrice());
    }

    @Test
    void setUnitPrice() {
        InvoiceItem id = new InvoiceItem("2", "Desc", 10, 5);
        assertDoesNotThrow(() -> id.setUnitPrice(2));
        double prz = id.getUnitPrice();
        assertEquals(2, prz);
    }

    @Test
    void getTotal() {
        InvoiceItem id = new InvoiceItem("2", "Desc", 10, 5);
        double tot = id.getTotal();
        assertEquals(50, tot);
    }

    @Test
    void testToString() {
        InvoiceItem id = new InvoiceItem("2", "Desc", 10, 5);
        assertEquals("InvoiceItem[id= 2,desc= Desc,qty= 10,unitPrice= 5.0]",id.toString());
    }
}