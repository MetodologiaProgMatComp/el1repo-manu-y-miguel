public class Ball {
    private float x;
    private float y;
    private float xDelta;
    private float yDelta;
    private int radius;
    public Ball(float x,float y,int radius,float xDelta,float yDelta){
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.yDelta=yDelta;
        this.xDelta=xDelta;}

    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float getY() {
        return y;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }
    public void move (){
        x+=xDelta;
        y+=yDelta;
    }
    public void reflectHorizontal(){
        xDelta=-xDelta;
    }
    public void reflectVertical(){
        yDelta=-yDelta;
    }
    public String toString(){
        return "Ball[("+x+","+y+"),speed=("+xDelta+","+yDelta+")]";
    }
}
