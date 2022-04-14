package _10_stack_queue.exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        Stack<String>stack= new Stack<>();
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] array = str.toLowerCase().split("");
        for (int i = 0; i < array.length; i++) {
            queue.add(array[i]);
            stack.push(array[i]);
        }
        System.out.println(stack);
        System.out.println(queue);
        for (int i = 0; i <array.length ; i++) {
            if (!stack.pop().equals(queue.poll())){
                
    }
}
    }
}