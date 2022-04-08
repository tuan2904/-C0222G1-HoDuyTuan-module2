package _07_abstractClass_interface.exercise.resizeable;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        Shape[] rectangle = new Shape[3];
        rectangle[0] = new Circle(4);
        rectangle[1] = new Square("blu",true,6.0);
        rectangle[2] = new Rectangle(6, 9);

        for (Shape arr : rectangle
        ) {
            System.out.println(arr.toString());


            for (Shape arr1 : rectangle
            ) {
                arr1.resize(Math.random()*100);
                System.out.println(arr1);
            }
        }  System.out.println("  ");
    }

}
