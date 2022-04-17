package _10_stack_queue.exercise;
import java.util.Scanner;
import java.util.Stack;

public class Decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Input number: ");
        int number = scanner.nextInt();
        int number1 = 0;
        do {
            number1 = number % 2;
            stack.push(number1);
            number = number / 2;
        }
        while (number > 0);

        System.out.println("Number after chance: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}