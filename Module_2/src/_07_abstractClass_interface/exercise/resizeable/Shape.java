package _07_abstractClass_interface.exercise.resizeable;

public abstract class Shape implements Resizeable {
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
    public abstract double getArea();


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
                getColor() +
                " and "
                + (isFiller()?"filler": " not filler");

        }
}
