import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {
        Ball ball = new Ball(1,2,4,0.5f,0.3f);
        assertEquals(1, ball.getX());
    }

    @Test
    void setX() {
        Ball ball = new Ball(1,2,4,0.5f,0.3f);
        ball.setX(2);
        double x = ball.getX();
        assertEquals(x, 2);
    }

    @Test
    void setY() {
        Ball ball = new Ball(1,2,4,0.5f,0.3f);
        ball.setY(4);
        double y = ball.getY();
        assertEquals(y, 4);
    }

    @Test
    void getY() {
        Ball ball = new Ball(1,2,4,0.5f,0.3f);
        assertEquals(2, ball.getY());
    }

    @Test
    void getRadius() {
        Ball ball = new Ball(1,2,4,0.5f,0.3f);
        assertEquals(4, ball.getRadius());
    }

    @Test
    void setRadius() {
        Ball ball = new Ball(1,2,4,0.5f,0.3f);
        ball.setRadius(5);
        double rad = ball.getRadius();
        assertEquals(rad, 5);
    }

    @Test
    void getxDelta() {
        Ball ball = new Ball(1,2,4,0.5f,0.3f);
        assertEquals(0.5f, ball.getxDelta());
    }

    @Test
    void setyDelta() {
        Ball ball = new Ball(1,2,4,0.5f,0.3f);
        ball.setyDelta(0.3f);
        double ydel = ball.getyDelta();
        assertEquals(ydel, 0.3f);
    }

    @Test
    void getyDelta() {
        Ball ball = new Ball(1,2,4,0.5f,0.3f);
        assertEquals(0.3f, ball.getyDelta());
    }

    @Test
    void setxDelta() {
        Ball ball = new Ball(1,2,4,0.5f,0.3f);
        ball.setxDelta(0.2f);
        double xdel = ball.getxDelta();
        assertEquals(xdel, 0.2f);
    }

    @Test
    void move() {
        Ball ball = new Ball(1,2,4,0.5f,0.3f);
        ball.move();
        float x = ball.getX();
        float y = ball.getY();
        assertEquals(1.5f, x);
        assertEquals(2.3f, y);
    }

    @Test
    void reflectHorizontal() {
        Ball ball = new Ball(1,2,4,0.5f,0.3f);
        ball.reflectHorizontal();
        float x = ball.getxDelta();
        assertEquals(-0.5f, x);
    }

    @Test
    void reflectVertical() {
        Ball ball = new Ball(1,2,4,0.5f,0.3f);
        ball.reflectVertical();
        float y = ball.getyDelta();
        assertEquals(-0.3f, y);
    }

    @Test
    void testToString() {
        Ball ball = new Ball(1,2,4,0.5f,0.3f);
        assertEquals("Ball[(1.0,2.0),speed=(0.5,0.3)]", ball.toString());
    }
}