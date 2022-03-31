package _01_introduction_to_java.practice;

import java.util.Scanner;

public class TestLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year;
        year = scanner.nextInt();
        boolean leapYear = false;

        boolean leapYear1 = year % 4 == 0;
        if (leapYear1) {
            boolean leapYear2 = year % 100 == 0;
            if (leapYear2) {
                boolean leapYear3 = year % 400 == 0;
                if (leapYear3) {
                    leapYear = true;
                }

            } else {
                leapYear = true;
            }
        }
        if (leapYear) {
            System.out.println(year + " This is a leap year ");
        } else {
            System.out.println(year + " this is not a leap year");
        }
    }
}




