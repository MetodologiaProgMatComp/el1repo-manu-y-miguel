package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Ball;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float X, float Y, int Radius, float XDelta, float YDelta) {
        x= X;
        y= Y;
        radius = Radius;
        xDelta = XDelta;
        yDelta = YDelta;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move() {
        x += xDelta;
        y += yDelta;
    }
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }
    public void reflectVertical() {
        yDelta = - yDelta;
    }
    public String toString() {
        return "Ball [(" + x + "," + y + "), speed=(" + xDelta + "," + yDelta + ")]";
    }
}
