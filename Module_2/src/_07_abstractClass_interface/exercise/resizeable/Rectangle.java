package _07_abstractClass_interface.exercise.resizeable;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Rectangle extends Shape implements  Resizeable{
        private double width = 1.0;
        private double length = 1.0;

    public Rectangle() {
        }

        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

    public Rectangle(String color, boolean filler, double width, double length) {
        super(color, filler);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getArea() {
            return width * this.length;
        }

        public double getPerimeter() {
            return 2 * (width + this.length);
        }




    @Override
    public void resize(double percent) {
       this.length += this.length *percent/100;
        this.width += this.width * percent/100;

    }


        @Override
        public String toString() {
            return
                    "Rectangle : "
                    + "width = "
                    + width
                    + ", length = "
                    + length
                    + ",Area= "
                    +getArea();
        }
    }
