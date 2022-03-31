package _01_introduction_to_java.practice;
import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
      double weight;
      double height;
      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight");
        weight=scanner.nextDouble();
        System.out.println("Enter height");
        height=scanner.nextDouble();
        double bmi = weight * (height*height);

        if (bmi<18.5){
            System.out.println(" Underweight");
        }if (25.0> bmi & bmi >= 18.5 ){
            System.out.println(" Normal");
        }if (bmi >= 25.0 & bmi < 30.0){
            System.out.println("Overweight");
        }if (bmi>= 30.0){
            System.out.println(" Obese");
        }
    }
}
