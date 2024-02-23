package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.Circle;

public class MainTestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.1);
        System.out.println(c1); // toString()
        Circle c2 = new Circle(); // default constructor
        System.out.println(c2);
        // Test setter and getter
        c1.setRadius(2.2);
        System.out.println(c1); // toString()
        System.out.println("radius is: " + c1.getRadius());
        // Test getArea() and getCircumference()
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
}
