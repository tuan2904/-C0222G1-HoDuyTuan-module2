package _07_abstractClass_interface.exercise.resizeable;

public class Square extends Shape {
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

    public double getArea() {
        return side * side;
    }


    @Override
    public void resize(double percent) {
        this.side += this.side * percent / 100;
    }

    @Override
    public String toString() {
        return "Square: " +
                "side= " +
                side + ","+
                super.toString()
                + ",Area= "
                + getArea();
    }

}

