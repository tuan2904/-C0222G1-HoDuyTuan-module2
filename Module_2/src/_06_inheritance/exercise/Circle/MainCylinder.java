package _06_inheritance.exercise.Circle;

import javax.crypto.spec.PSource;

public class MainCylinder {
    public static void main(String[] args) {


        Cylinder cylinder = new Cylinder(8);
        System.out.println(cylinder);

        Cylinder cylinder1=new Cylinder(6,"blu",8);
        System.out.println(cylinder1);
        System.out.println("Area : " + cylinder1.cylindricalArea());
    }
}
