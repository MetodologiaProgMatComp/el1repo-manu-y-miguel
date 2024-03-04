package classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MypointTest {

    @Test
    void getX() {
        Mypoint point = new Mypoint(3,4);
        assertEquals(point.getX(),3);
    }

    @Test
    void setX() {
        Mypoint point = new Mypoint(3,4);
        point.setX(5);
        assertEquals(point.getX(),5);
    }

    @Test
    void getY() {
        Mypoint point = new Mypoint(3,4);
        assertEquals(point.getY(),4);
    }

    @Test
    void setY() {
        Mypoint point = new Mypoint(3,4);
        point.setY(7);
        assertEquals(point.getY(),7);
    }

    @Test
    void getXY() {
        Mypoint point = new Mypoint(3,4);
        assertEquals("{3,4}",point.getArraytoString(point.getXY()));
    }

    @Test
    void setXY() {
        Mypoint point = new Mypoint(3,4);
        point.setXY(1,5);
        assertEquals("{1,5}",point.getArraytoString(point.getXY()));
    }

    @Test
    void getArraytoString() {
        Mypoint point = new Mypoint(3,4);
        assertEquals("{3,4}",point.getArraytoString(point.getXY()));
    }

    @Test
    void testToString() {
        Mypoint point = new Mypoint(3,4);
        assertEquals("(3,4)", point.toString());
    }

    @Test
    void distance() {
        Mypoint point = new Mypoint();
        double dist = Math.sqrt(25);
        assertEquals(point.distance(3,4),dist);
    }

    @Test
    void testDistance() {
        Mypoint point = new Mypoint(3,4);
        Mypoint point2 = new Mypoint(1,7);
        double dist = Math.sqrt(13);
        assertEquals(point.distance2(point2),dist);
    }

    @Test
    void testDistance1() {
        Mypoint point = new Mypoint(3,4);
        double dist = Math.sqrt(25);
        assertEquals(point.distance3(),dist);
    }
}