package _01_introduction_to_java.practice;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        float weidth;
        float height;

        Scanner scanner= new Scanner(System.in);

        System.out.println(" Enter width: ");
        weidth = scanner.nextFloat();

        System.out.println(" Enter height: ");
        height = scanner.nextFloat();

        float area = weidth * height;
        System.out.println(" Area is : " + area);
    }
}
