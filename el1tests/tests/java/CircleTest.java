import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle circ = new Circle(3.0);
        double r = circ.getRadius();
        assertEquals(r,3.0);
    }

    @Test
    void setRadius() {
        Circle circ = new Circle(3.0);
        circ.setRadius(7.0);
        double radius=circ.getRadius();
        assertEquals(radius, 7.0);
    }

    @Test
    void getArea() {
        Circle circ = new Circle(3.0);
        double area = circ.getArea();
        assertEquals(Math.PI*3.0*3.0, area);
    }

    @Test
    void getCircumference() {
        Circle circ= new Circle(3.0);
        double circl=circ.getCircumference();
        assertEquals(6*Math.PI,circl);
    }

    @Test
    void testToString() {
        Circle circ= new Circle(8.0);
        assertEquals("Circle[radius=8.0]",circ.toString());
    }
}