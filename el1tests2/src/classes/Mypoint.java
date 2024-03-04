package classes;

public class Mypoint{
    private int x=0;
    private int y=0;
    public Mypoint() {}
    public Mypoint(int x,int y){
        this.x=x;
        this.y=y;}
    public int getX() {return x;}
    public void setX(int x) {this.x = x;}
    public int getY() {return y;}
    public void setY(int y) {this.y = y;}
    public int[] getXY(){
        int[] int2=new int[]{x,y};
        return int2;}
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;}
    public String getArraytoString(int[]lista){
        int x= lista[0];
        int y= lista[1];
        return String.format("{%s,%s}",x,y);
    }
    public String toString(){
        return"("+getX()+","+getY()+")";}
    public double distance(int x,int y){
        int deltaX= this.x-x;
        int deltaY=this.y-y;
        return Math.sqrt(Math.pow(deltaX,2)+Math.pow(deltaY,2));
    }
    public double distance2 (Mypoint another) {
        int deltaX=this.x-another.getX();
        int deltaY=this.y-another.getY();
        return Math.sqrt(Math.pow(deltaX,2)+Math.pow(deltaY,2));}
    public double distance3(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));}

}