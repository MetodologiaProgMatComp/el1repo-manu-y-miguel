package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Ball.Ball;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {
        Ball Bola1 = new Ball(3.5F,2,5,3.3F,1.2F);
        assertEquals(3.5F, Bola1.getX());
    }

    @Test
    void getY() {
        Ball Bola1 = new Ball(3.5F,2,5,3.3F,1.2F);
        assertEquals(2, Bola1.getY());
    }

    @Test
    void setX() {
        Ball bola2 = new Ball(2.2F,2,3,4,5);
        int nuevaX = 3;
        bola2.setX(nuevaX);
        assertEquals(nuevaX, bola2.getX());
    }

    @Test
    void setY() {
        Ball bola2 = new Ball(2.2F,2,3,4,5);
        int nuevaY = 3;
        bola2.setY(nuevaY);
        assertEquals(nuevaY, bola2.getY());
    }

    @Test
    void getRadius() {
        Ball Bola1 = new Ball(3.5F,2,5,3.3F,1.2F);
        assertEquals(5, Bola1.getRadius());
    }

    @Test
    void setRadius() {
        Ball bola2 = new Ball(2.2F,2,3,4,5);
        int nuevaRadio = 4;
        bola2.setRadius(nuevaRadio);
        assertEquals(nuevaRadio, bola2.getRadius());
    }

    @Test
    void getXDelta() {
        Ball Bola1 = new Ball(3.5F,2,5,3.3F,1.2F);
        assertEquals(3.3F, Bola1.getXDelta());
    }

    @Test
    void setXDelta() {
        Ball bola2 = new Ball(2.2F,2,3,4,5);
        int nuevaXDelta = 3;
        bola2.setXDelta(nuevaXDelta);
        assertEquals(nuevaXDelta, bola2.getXDelta());
    }

    @Test
    void getYDelta() {
        Ball Bola1 = new Ball(3.5F,2,5,3.3F,1.2F);
        assertEquals(1.2F, Bola1.getYDelta());
    }

    @Test
    void setYDelta() {
        Ball bola2 = new Ball(2.2F,2,3,4,5);
        int nuevaYDelta = 3;
        bola2.setYDelta(nuevaYDelta);
        assertEquals(nuevaYDelta, bola2.getYDelta());
    }

    @Test
    void move() {
        float newXdelta = 4.5F;
        float newYdelta = 1.5F;
        Ball bola3 = new Ball(3.4F,2.3F,4,newXdelta, newYdelta);
        bola3.move();

        assertEquals(7.9F, bola3.getX());
        assertEquals(1.5F + 2.3F, bola3.getY());
    }

    @Test
    void reflectHorizontal() {
        Ball bol4 = new Ball(2.3f,2.44f,4,1.5f,4.3f);
        bol4.reflectHorizontal();

        assertEquals(-1.5f, bol4.getXDelta());
    }

    @Test
    void reflectVertical() {
        Ball bol4 = new Ball(2.3f,2.44f,4,1.5f,4.3f);
        bol4.reflectVertical();

        assertEquals(-4.3f, bol4.getYDelta());
    }

    @Test
    void testToString() {
        Ball bol4 = new Ball(2.3f,2.44f,4,1.5f,4.3f);

        String esperado = "Ball [(2.3,2.44), speed=(1.5,4.3)]";
        String resuelto = bol4.toString();

        assertEquals(esperado, resuelto);
    }
}