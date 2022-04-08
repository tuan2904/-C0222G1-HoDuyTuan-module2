package _07_abstractClass_interface.exercise.colorable;

public class Circle extends Shape {
    private double radius=1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI ;
    }
    public double getPerimeter(){
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return  " Circle radius = "
                + radius ;
    }
}
