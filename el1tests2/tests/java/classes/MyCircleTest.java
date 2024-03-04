package classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @Test
    void getRadius() {
        MyCircle circle = new MyCircle(2,5,3);
        assertEquals(circle.getRadius(),3);
    }

    @Test
    void setRadius() {
        MyCircle circle = new MyCircle(2,5,3);
        circle.setRadius(2);
        assertEquals(circle.getRadius(),2);
    }

    @Test
    void getCenter() {
        MyCircle circle = new MyCircle(new Mypoint(2,3),3);
        assertEquals(circle.getCenter().toString(),"(2,3)");
    }

    @Test
    void setCenter() {
        MyCircle circle = new MyCircle(new Mypoint(2,3),3);
        circle.setCenter(new Mypoint(1,2));
        assertEquals(circle.getCenter().toString(),"(1,2)");
    }

    @Test
    void getCenterX() {
        MyCircle circle = new MyCircle(new Mypoint(2,3),3);
        assertEquals(circle.getCenterX(),2);
    }

    @Test
    void setCenterX() {
        MyCircle circle = new MyCircle(new Mypoint(2,3),3);
        circle.setCenterX(3);
        assertEquals(circle.getCenterX(),3);
    }

    @Test
    void getCenterY() {
        MyCircle circle = new MyCircle(new Mypoint(2,3),3);
        assertEquals(circle.getCenterY(),3);
    }

    @Test
    void setCenterY() {
        MyCircle circle = new MyCircle(new Mypoint(2,3),3);
        circle.setCenterY(6);
        assertEquals(circle.getCenterY(),6);
    }

    @Test
    void getCenterXY() {
        MyCircle circle = new MyCircle(new Mypoint(2,3),3);
        assertEquals(circle.getArraytoString(circle.getCenterXY()),"{2,3}");
    }

    @Test
    void setCenterXY() {
        MyCircle circle = new MyCircle(new Mypoint(2,3),3);
        circle.setCenterXY(3,5);
        assertEquals(circle.getArraytoString(circle.getCenterXY()),"{3,5}");
    }

    @Test
    void getArraytoString() {
        MyCircle circle = new MyCircle(new Mypoint(2,3),3);
        assertEquals(circle.getArraytoString(circle.getCenterXY()),"{2,3}");
    }

    @Test
    void testToString() {
        MyCircle circle = new MyCircle(new Mypoint(2,3),3);
        assertEquals(circle.toString(), "MyCircle[radius= 3,center= (2,3)]");
    }

    @Test
    void getArea() {
        MyCircle circle = new MyCircle(2,5,3);
        assertEquals(circle.getArea(),Math.PI*3*3);
    }

    @Test
    void getCircumference() {
        MyCircle circle = new MyCircle(2,5,3);
        assertEquals(circle.getCircumference(),2*Math.PI*3);
    }

    @Test
    void distance() {
        MyCircle circle2 = new MyCircle(2,5,3);
        MyCircle circle = new MyCircle(new Mypoint(2,3),3);
        assertEquals(circle.distance(circle2),2);
    }
}