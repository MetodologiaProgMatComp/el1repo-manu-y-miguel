package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Circle.Circle;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @org.junit.jupiter.api.Test
    void getRadius() {
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        double radius = 3.0;
        Circle circle = new Circle(radius);
        double areaEsperada = Math.PI * radius * radius;
        assertEquals(areaEsperada, circle.getArea());
    }

    @org.junit.jupiter.api.Test
    void getCircumference() {
        double radius = 2.0;
        Circle circle = new Circle(radius);
        double circumferenciaEsperada = 2 * Math.PI * radius;
        assertEquals(circumferenciaEsperada,circle.getCircumference());

    }

    @org.junit.jupiter.api.Test
    void testToString() {
        double radius = 3.0;
        Circle circle = new Circle(radius);
        assertEquals("Circle[radius = 3]", circle.toString());
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        Circle circle = new Circle();
        double nuevoRadius = 2.9;
        circle.setRadius(nuevoRadius);
        assertEquals(nuevoRadius, circle.getRadius());
    }
}