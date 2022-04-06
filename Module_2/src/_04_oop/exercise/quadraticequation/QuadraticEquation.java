package _04_oop.exercise.quadraticequation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //    public double getA() {
//        return a;
//    }
//
//    public double getB() {
//        return b;
//    }
//
//    public double getC() {
//        return c;
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (this.getDiscriminant() < 0) return 0;
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        if (this.getDiscriminant() < 0) return 0;
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

//    public static void main(String[] args) {
//        Scanner enter = new Scanner(System.in);
//        double a, b, c;
//        System.out.println(" Eter a,b,c");
//        a = enter.nextDouble();
//        b = enter.nextDouble();
//        c = enter.nextDouble();
//        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
//        if (quadraticEquation.getDiscriminant() < 0) {
//            System.out.println("The equation has no roots");
//        } else if (quadraticEquation.getDiscriminant() >= 0) {
//            System.out.println("The equation has 2 solutions: " + quadraticEquation.getRoot1() + quadraticEquation.getRoot2());
//        } else {
//            System.out.println("solution of delta : " + quadraticEquation.getDiscriminant());
//            System.out.println("solution of root1 : " + quadraticEquation.getRoot1());
//            System.out.println("solution of root2 : " + quadraticEquation.getRoot2());
//        }
//    }
}
