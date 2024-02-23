package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Circle;
/**
 * La clase Circle moldea un circulo con un radio
 */
public class Circle {
    private double radius;
    public Circle(){
        radius = 1.0;

    }
    public Circle(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getCircumference() {
        return 2*Math.PI*radius;
    }
    public String toString() {
        return "Circle[radius= " + radius + "]";
    }
    public void setRadius(double newRadius){
        radius = newRadius;
    }

}
