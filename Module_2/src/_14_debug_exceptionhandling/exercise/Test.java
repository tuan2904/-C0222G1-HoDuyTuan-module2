package _14_debug_exceptionhandling.exercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        double a, b, c;
        boolean flag = true;
        while (flag) {
            try {
                flag = false;
                System.out.println("Nhập cạnh a: ");
                a = Double.parseDouble(enter.nextLine());
                System.out.println("Nhập cạnh b: ");
                b = Double.parseDouble(enter.nextLine());
                System.out.println("Nhập cạnh c: ");
                c = Double.parseDouble(enter.nextLine());
                check(a, b, c);
            } catch (NumberFormatException e) {
                System.out.println("Nhập lại số: ");
                flag = true;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        }
    }

    public static void check(double a, double b, double c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Bạn đã nhập số âm mời nhập lại.");
        }
        if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            throw new IllegalTriangleException("Không phải tam giác");
        } else {
            System.out.println("Tam giác hợp lệ.");
        }
    }
}
