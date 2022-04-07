package _02_vong_lap.exercise;

public class Show20Primes {
    public static void main(String[] args) {
//        Scanner number = new Scanner(System.in);
        int number = 0;
        int number1 = 2;
//        System.out.println("Enter primes");
//        int enter = number.nextInt();
        while (number < 20) {
            int count = 0;
            for (int i = 1; i <= number1; i++) {
                if (number1 % i == 0) {
                    count++;
                }
            }
            if (count==2) {
                System.out.println(number1);
                number++;
            }number1++;
        }
    }
}
