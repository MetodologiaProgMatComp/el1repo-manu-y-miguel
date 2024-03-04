package classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MylineTest {

    @Test
    void getBegin() {
        Myline line = new Myline(3,5,1,3);
        assertEquals(line.getArraytoString(line.getBegin().getXY()),"{3,5}");
    }

    @Test
    void setBegin() {
        Myline line = new Myline(3,5,1,3);
        line.setBegin(new Mypoint(0,0));
        assertEquals(line.getArraytoString(line.getBegin().getXY()),"{0,0}");

    }

    @Test
    void setEnd() {
        Myline line = new Myline(3,5,1,3);
        line.setEnd(new Mypoint(5,9));
        assertEquals(line.getArraytoString(line.getEnd().getXY()),"{5,9}");
    }

    @Test
    void getEnd() {
        Myline line = new Myline(3,5,1,3);
        assertEquals(line.getArraytoString(line.getEnd().getXY()),"{1,3}");
    }

    @Test
    void getBeginX() {
        Myline line = new Myline(3,5,1,3);
        assertEquals(line.getBeginX(),3);
    }

    @Test
    void setBeginX() {
        Myline line = new Myline(3,5,1,3);
        line.setBeginX(4);
        assertEquals(line.getBeginX(),4);
    }

    @Test
    void getBeginY() {
        Myline line = new Myline(3,5,1,3);
        assertEquals(line.getBeginY(),5);
    }

    @Test
    void setBeginY() {
        Myline line = new Myline(3,5,1,3);
        line.setBeginY(2);
        assertEquals(line.getBeginY(),2);
    }

    @Test
    void getEndY() {
        Myline line = new Myline(3,5,1,3);
        assertEquals(line.getEndY(),3);
    }

    @Test
    void setEndY() {
        Myline line = new Myline(3,5,1,3);
        line.setEndY(6);
        assertEquals(line.getEndY(),6);
    }

    @Test
    void getEndX() {
        Myline line = new Myline(3,5,1,3);
        assertEquals(line.getEndX(),1);
    }

    @Test
    void setEndX() {
        Myline line = new Myline(3,5,1,3);
        line.setEndX(7);
        assertEquals(line.getEndX(),7);
    }

    @Test
    void getBeginXY() {
        Myline line = new Myline(3,5,1,3);
        assertEquals(line.getArraytoString(line.getBeginXY()),"{3,5}");
    }

    @Test
    void getArraytoString() {
        Myline line = new Myline(3,5,1,3);
        assertEquals(line.getArraytoString(line.getBegin().getXY()),"{3,5}");
    }

    @Test
    void setBeginXY() {
        Myline line = new Myline(3,5,1,3);
        line.setBeginXY(1,2);
        assertEquals(line.getArraytoString(line.getBeginXY()),"{1,2}");
    }

    @Test
    void getEndXY() {
        Myline line = new Myline(3,5,1,3);
        assertEquals(line.getArraytoString(line.getEndXY()),"{1,3}");
    }

    @Test
    void setEndXY() {
        Myline line = new Myline(3,5,1,3);
        line.setEndXY(9,3);
        assertEquals(line.getArraytoString(line.getEndXY()),"{9,3}");
    }

    @Test
    void getLength() {
        Myline line = new Myline(3,5,3,5);
        assertEquals(line.getLength(),0);
    }

    @Test
    void getGradient() {
        Myline line = new Myline(3,5,1,3);
        assertEquals(line.getGradient(),Math.atan2(2,2));
    }

    @Test
    void testToString() {
        Myline line = new Myline(3,5,1,3);
        assertEquals(line.toString(), "MyLine[begin= (3,5),end= (1,3)]");
    }
}