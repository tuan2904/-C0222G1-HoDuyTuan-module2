package _07_abstractClass_interface.exercise.resizeable;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        Shape[] rectangle = new Shape[3];
        rectangle[0] = new Circle("red", true, 6);
        rectangle[1] = new Square("blu", true, 6.0);
        rectangle[2] = new Rectangle("green", true, 5, 4);

        for (Shape arr : rectangle
        ) {
            System.out.println("before the change ");
            System.out.println("Area before");
            System.out.println(arr.getArea());
            System.out.println(arr.toString());
            System.out.println("\n");
        }
        double ramdom = (Math.random() * 100);
        for (Shape arr1 : rectangle
        ) {
            arr1.resize(ramdom);
            System.out.println(" After the chance ");
//                System.out.println(arr1);
            System.out.println(" Area after the chance");
            System.out.println(arr1.getArea());
            System.out.println(arr1.toString());
        }
    }
}
