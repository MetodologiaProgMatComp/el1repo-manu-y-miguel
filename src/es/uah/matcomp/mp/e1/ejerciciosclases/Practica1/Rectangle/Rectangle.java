package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Rectangle;

public class Rectangle {
    private float Length;
    private float Width;
    public Rectangle(){
        Length = 1.0f;
        Width = 1.0f;
    }
    public Rectangle(float L, float W){
        Length = L;
        Width = W;
    }
    public float getLength(){
        return Length;
    }
    public float getWidth(){
        return Width;

    }
    public void setLength(float newLength){
        Length = newLength;
    }
    public void setWidth(float newWidth){
        Width = newWidth;
    }
    public double getArea(){
        return Length * Width;
    }
    public double getPerimeter(){
        return (Length * 2) + (Width * 2);
    }
    public String toString(){
        return "Rectangle [Length= " + Length + "Width = " + Width + "]";
    }

}
