package _05_access_static.exercise.Cirle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";


    public void Circle() {

    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;

    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

}
