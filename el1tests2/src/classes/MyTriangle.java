package classes;

public class MyTriangle extends Mypoint {
    private Mypoint v1;
    private Mypoint v2;
    private Mypoint v3;
    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
        this.v1=new Mypoint(x1,y1);
        this.v2=new Mypoint(x2,y2);
        this.v3=new Mypoint(x3,y3);}
    public MyTriangle(Mypoint v1,Mypoint v2,Mypoint v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;}
    public String toString(){
        String newv1= v1.getArraytoString(v1.getXY());
        String newv2= v2.getArraytoString(v2.getXY());
        String newv3= v3.getArraytoString(v3.getXY());
        return "MyTriangle[v1=("+newv1+"),v2=("+newv2+"),v3=("+newv3+")]";}
    public double getPerimeter(){
        return v1.distance2(v2)+v1.distance2(v3)+v2.distance2(v3);}
    public String getType() {
        String type;
        if (v1.distance2(v2) == v1.distance2(v3) && v2.distance2(v3)==v1.distance2(v2)) {
            type = "Equilateral";
        } else if (v1.distance2(v2) == v1.distance2(v3) && v2.distance2(v3)!=v1.distance2(v2) || v2.distance2(v1) == v2.distance2(v3) && v1.distance2(v3)!=v2.distance2(v1) || v3.distance2(v1) == v3.distance2(v2) && v1.distance2(v2)!=v3.distance2(v1)) {
            type = "Isosceles";
        } else{
            type = "Scalene";}
        return type;
    }}