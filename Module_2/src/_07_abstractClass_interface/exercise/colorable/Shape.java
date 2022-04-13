package _07_abstractClass_interface.exercise.colorable;

public abstract class Shape {
    private String color="green";
    private boolean filler=true;

    public Shape() {
    }

    public Shape(String color, boolean filler) {
        this.color = color;
        this.filler = filler;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiller() {
        return filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }

    @Override
    public String toString() {
        return
                "color = " + color
                + " filler = " + filler
                ;
    }

    public  double getArea() {
        return getArea();
    }
}

