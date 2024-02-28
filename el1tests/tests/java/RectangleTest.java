import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle rectangle = new Rectangle(4,5);
        float len = rectangle.getLength();
        assertEquals(len,4);
    }

    @Test
    void setLength() {
        Rectangle rectangle = new Rectangle(4,5);
        rectangle.setLength(7);
        double length = rectangle.getLength();
        assertEquals(length, 7);
    }

    @Test
    void getWidth() {
        Rectangle rectangle = new Rectangle(4,5);
        float width = rectangle.getWidth();
        assertEquals(width , 5);
    }

    @Test
    void setWidth() {
        Rectangle rectangle = new Rectangle(4,5);
        rectangle.setWidth(2);
        double width = rectangle.getWidth();
        assertEquals(width, 2);
    }

    @Test
    void getArea() {
        Rectangle rectangle = new Rectangle(4,5);
        assertEquals(rectangle.getArea(), 20);
    }

    @Test
    void getPerimeter() {
        Rectangle rectangle = new Rectangle(4,5);
        assertEquals(18, rectangle.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(4,5);
        assertEquals("Rectangle[length=4.0, width=5.0]", rectangle.toString());
    }
}