package _04_oop.exercise.quadraticequation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        double a, b, c;
        System.out.println(" Enter a,b,c");
        a = enter.nextDouble();
        b = enter.nextDouble();
        c = enter.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if (quadraticEquation.getDiscriminant() >= 0) {
            System.out.println("The equation has 2 solutions: " + quadraticEquation.getRoot1() + quadraticEquation.getRoot2());
        } else {
            System.out.println("solution of delta : " + quadraticEquation.getDiscriminant());
            System.out.println("solution of root1 : " + quadraticEquation.getRoot1());
            System.out.println("solution of root2 : " + quadraticEquation.getRoot2());
        }
    }
}
