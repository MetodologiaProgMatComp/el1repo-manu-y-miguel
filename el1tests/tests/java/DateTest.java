import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        Date date = new Date(9, 5, 2016);
        int day = date.getDay();
        assertEquals(day, 9);
    }

    @Test
    void getMonth() {
        Date date = new Date(9, 5, 2016);
        int month = date.getMonth();
        assertEquals(month, 5);
    }

    @Test
    void getYear() {
        Date date = new Date(9, 5, 2016);
        int year = date.getYear();
        assertEquals(year, 2016);
    }

    @Test
    void setDay() {
        Date date = new Date(9, 5, 2016);
        date.setDay(15);
        assertEquals(date.getDay(), 15);
    }

    @Test
    void setMonth() {
        Date date = new Date(9, 5, 2016);
        date.setMonth(2);
        assertEquals(date.getMonth(), 2);
    }

    @Test
    void setYear() {
        Date date = new Date(9, 5, 2016);
        date.setYear(2008);
        assertEquals(date.getYear(), 2008);
    }

    @Test
    void setDate() {
        Date date = new Date(9, 5, 2016);
        date.setDate(18, 8, 2018);
        assertEquals(date.getDay(), 18);
        assertEquals(date.getMonth(), 8);
        assertEquals(date.getYear(), 2018);
    }

    @Test
    void testToString() {
        Date date = new Date(9, 5, 2016);
        assertEquals(date.toString(), "9/5/2016");
    }
}