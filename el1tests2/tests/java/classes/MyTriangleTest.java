package classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void testToString() {
        MyTriangle triangle = new MyTriangle(2,1,3,5,2,7);
        assertEquals(triangle.toString(), "MyTriangle[v1=({2,1}),v2=({3,5}),v3=({2,7})]");
    }

    @Test
    void getPerimeter() {
        MyTriangle triangle = new MyTriangle(new Mypoint(0,0),new Mypoint(0,3),new Mypoint(4,0));
        assertEquals(triangle.getPerimeter(),12);
    }

    @Test
    void getType() {
        MyTriangle triangle1 = new MyTriangle(new Mypoint(2,1),new Mypoint(3,1),new Mypoint(2,2));
        MyTriangle triangle2 = new MyTriangle(new Mypoint(0,0),new Mypoint(0,3),new Mypoint(4,0));
        assertEquals(triangle1.getType(),"Isosceles");
        assertEquals(triangle2.getType(),"Scalene");
    }
}