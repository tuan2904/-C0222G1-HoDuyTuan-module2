package _02_vong_lap.exercise;
//import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
//        Scanner number = new Scanner(System.in);
        int count1 = 0;
        int count2 = 2;
//        System.out.println("Enter primes");
//        int enter = number.nextInt();
        while (count1 < 20) {
            int count = 0;
            for (int i = 1; i <= count2; i++) {
                if (count2 % i == 0) {
                    count++;
                }
            }
            if (count==2) {
                System.out.println(count2);
                count1++;
            }count2++;
        }
    }
}
