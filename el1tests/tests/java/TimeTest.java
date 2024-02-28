import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        Time time=new Time(12,21,33);
        int hour = time.getHour();
        assertEquals(hour,12);
    }

    @Test
    void getMinute() {
        Time time=new Time(12,21,33);
        int minute = time.getMinute();
        assertEquals(minute,21);
    }

    @Test
    void getSecond() {
        Time time=new Time(12,21,33);
        int second = time.getSecond();
        assertEquals(second,33);
    }

    @Test
    void setHour() {
        Time time=new Time(12,21,33);
        time.setHour(6);
        int hour = time.getHour();
        assertEquals(hour,6);
    }

    @Test
    void setMinute() {
        Time time=new Time(12,21,33);
        time.setMinute(5);
        int minute = time.getMinute();
        assertEquals(minute,5);
    }

    @Test
    void setSecond() {
        Time time = new Time(12,21,33);
        time.setSecond(46);
        int second = time.getSecond();
        assertEquals(second,46);
    }

    @Test
    void setTime() {
        Time time = new Time(12,21,33);
        time.setTime(23,59,13);
        assertEquals(time.getHour(),23);
        assertEquals(time.getMinute(),59);
        assertEquals(time.getSecond(),13);
    }

    @Test
    void testToString() {
        Time time=new Time(12,21,33);
        assertEquals("12:21:33",time.toString());
    }

    @Test
    void nextSecond() {
        Time time=new Time(12,21,33);
        Time next =time.nextSecond();
        assertEquals("12:21:34",next.toString());
    }

    @Test
    void previousSecond() {
        Time time=new Time(12,21,33);
        Time prev=time.previousSecond();
        assertEquals("12:21:32",prev.toString());
    }
}