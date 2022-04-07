package _04_oop.exercise.fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private boolean on = true;
    private double radius;
    private int speed;
    private String color = "blu";

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void Fan() {
        this.speed = SLOW;
        this.radius = 5;
        this.color = "blu";
        this.on = false;
    }


    public void Fan(int speed, double radius, String color, boolean on) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

//    public void fan2(int speed, double radius, String color, boolean on) {
//        this.speed = speed;
//        this.radius = radius;
//        this.color = color;
//        this.on = on;
//    }

    @Override
    public String toString() {
        if (this.on) {
            return (" speed " + this.speed + " radius " + this.radius + " color " + this.color + " fan is on ");
        } else {
            return (" Color " + this.color + " radius " + this.radius + " fan is off ");
        }
    }

}
