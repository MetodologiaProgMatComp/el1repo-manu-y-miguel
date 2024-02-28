package composicion_agregación.ejercicio6;

import composicion_agregación.ejercicio4.Mypoint;
public class MyCircle extends Mypoint {
    private int radius=1;
    private Mypoint center= new Mypoint();
    public MyCircle(){}
    public MyCircle(int x,int y ,int radius){
        super(x,y);
        this.radius=radius;}
    public MyCircle(Mypoint center,int radius){
        this.radius=radius;
        this.center=new Mypoint(0,0);}
    public int getRadius() {return radius;}
    public void setRadius(int radius) {this.radius = radius;}
    public Mypoint getCenter() {return center;}
    public void setCenter(Mypoint center) {this.center = center;}
    public int getCenterX(){return this.center.getX();}
    public void setCenterX(int x){this.center.setX(x);}
    public int getCenterY(){return this.center.getY();}
    public void setCenterY(int y){this.center.setY(y);}
    public int[] getCenterXY(){
        int x= this.getCenterX();
        int y= this.getCenterY();
        int[] int2= new int[]{x,y};
        return int2;}
    public void setCenterXY(int x,int y){
        this.setCenterX(x);
        this.setCenterY(y);}
    public String getArraytoString(int[]lista){
        int x= lista[0];
        int y= lista[1];
        return String.format("{%s,%s}",x,y);}
    public String toString (){
        return "MyCircle[radius= "+radius+",center= ("+getCenterX()+","+getCenterY()+")]";}
    public double getArea(){
        return Math.PI*Math.pow(radius,2);}
    public double getCircumference(){
        return 2*Math.PI*radius;}
    public double distance(Mypoint another){
        int deltaX=this.getCenterX()-another.getX();
        int deltaY=this.getCenterY()-another.getY();
        return Math.sqrt(Math.pow(deltaX,2)+Math.pow(deltaY,2));}}
