package _04_oop.exercise;

import javax.crypto.spec.PSource;

class Fan {
     final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private boolean on=true;
    private double radius;
    private int speed;
    private String color = "blu";



    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

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
         this.speed=SLOW;
        this.radius=5;
         this.color="blu";
        this.on=false;
    }


    public void Fan(int speed, double radius, String color, boolean on) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on =on;
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
            return (" speed " + this.speed + " radius " + this.radius +  " color " + this.color + " fan is on " );
        } else {
                return (" Color " + this.color + " radius " + this.radius + " fan is off " );
        }
    }
    public static void main(String[] args) {
        Fan fan1=new Fan();
        fan1.Fan(3,10,"yellow",true);
        Fan fan2=new Fan();
        fan2.Fan(1,5,"blu",false);
        System.out.println(fan1);
        System.out.println(fan2);
    }
}


