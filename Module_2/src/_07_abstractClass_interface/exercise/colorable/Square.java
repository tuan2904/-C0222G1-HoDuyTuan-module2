package _07_abstractClass_interface.exercise.colorable;

public class Square extends Shape implements Colorable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filler, double side) {
        super(color, filler);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return side*side;
    }

    @Override
    public String toString() {
        return "Square : " + "side = " +
                side + super.toString()
                + " Area= " + getArea();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
