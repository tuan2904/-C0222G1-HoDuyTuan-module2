package _01_introduction_to_java.exercise;
import java.util.Scanner;
public class Change {
    public static void main(String[] args) {
        double vnd=23000;
        double usd;
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Nhập số USD cần đổi");
            usd=scanner.nextDouble();
          double change=usd * vnd;

        System.out.println("Số tiền quy đổi là: " + change);
    }
}
