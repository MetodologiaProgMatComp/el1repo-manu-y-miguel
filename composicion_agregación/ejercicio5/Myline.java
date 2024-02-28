package composicion_agregación.ejercicio5;
import composicion_agregación.ejercicio4.Mypoint;
public class Myline extends Mypoint{
    private Mypoint begin=new Mypoint();
    private Mypoint end=new Mypoint();
    public Myline(int x1,int y1, int x2, int y2){
        this.begin=new Mypoint(x1,y1);
        this.end=new Mypoint(x2,y2);}
    public Myline (Mypoint begin,Mypoint end){
        this.begin=begin;
        this.end=end;}
    public Mypoint getBegin(){return begin;}
    public void setBegin(Mypoint begin) {this.begin = begin;}
    public void setEnd(Mypoint end) {this.end = end;}
    public Mypoint getEnd() {return end;}
    public int getBeginX(){
        return this.begin.getX();}
    public void setBeginX(int x ){
        this.begin.setX(x);}
    public int getBeginY(){
        return this.begin.getY();}
    public void setBeginY(int y ){
        this.begin.setY(y);}
    public int getEndY(){
        return this.end.getY();}
    public void setEndY(int y ){
        this.end.setY(y);}
    public int getEndX(){
        return this.end.getX();}
    public void setEndX(int x ){
        this.end.setX(x);}
    public int[]getBeginXY(){
        int x= this.getBeginX();
        int y=this.getBeginY();
        int[] int2=new int[]{x,y};
        return int2;}
    public String getArraytoString(int[]lista){
        int x= lista[0];
        int y= lista[1];
        return String.format("{%s,%s}",x,y);}
    public void setBeginXY(int x,int y){
        this.setBeginX(x);
        this.setBeginY(y);}
    public int[]getEndXY(){
        int x= this.getEndX();
        int y=this.getEndY();
        int[] int2=new int[]{x,y};
        return int2;}
    public void setEndXY(int x,int y){
        this.setEndX(x);
        this.setEndY(y);}
    public double getLength(){
        return begin.distance(end);}
    public double getGradient(){
        int deltaX=this.getBeginX()-this.getEndX();
        int deltaY=this.getBeginY()-this.getEndY();
        return Math.atan2(deltaY,deltaX);}
    public String toString(){
        int x1= this.getBeginX();
        int x2= this.getEndX();
        int y1= this.getBeginY();
        int y2= getEndY();
        return "MyLine[begin= ("+x1+","+y1+"),end= ("+x2+","+y2+")]";}}