package _07_abstractClass_interface.exercise.resizeable;

public class Circle extends Shape{
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
            return  "A Circle with radius="
                    + getRadius()
                    + ", which is a subclass of "
                    + super.toString()
                    + ", Area=" +
                    + getArea();

        }

        @Override
        public void resize(double percent) {
            System.out.println(" After circle: ");
            setRadius(getRadius() * (percent/100));
            System.out.println(" ");
        }
    }
