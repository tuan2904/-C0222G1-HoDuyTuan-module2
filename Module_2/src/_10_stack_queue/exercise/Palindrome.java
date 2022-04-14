package _10_stack_queue.exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        String str = "Able was I ere I saw Elba";
        String[] array = str.toLowerCase().split("");
        for (int i = 0; i < array.length; i++) {
            queue.add(array[i]);
            stack.push(array[i]);
        }
        System.out.println("show array stack: ");
        System.out.println(stack);
        System.out.println("show array queue: ");
        System.out.println(queue);
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (!stack.pop().equals(queue.poll())) {
                flag = false;
                break;
            }
        }
        System.out.println("Đây có phải mảng Palindrome không: ");
        System.out.println(flag);

    }
}