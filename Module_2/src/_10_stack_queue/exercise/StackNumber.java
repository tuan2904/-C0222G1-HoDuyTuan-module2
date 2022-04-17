package _10_stack_queue.exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackNumber {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        Stack<Integer> stacks = new Stack<>();
        System.out.println("Enter element in array: ");
        int n = enter.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element: ");
            stacks.push(enter.nextInt());
        }
        System.out.println("Integer array: ");
        System.out.println(stacks);

        for (int i = 0; i < n; i++) {
            arr[i] = stacks.pop();
        }
        System.out.println("Integer array after chance: ");
        System.out.println(Arrays.toString(arr));


        System.out.println("Array before: ");
        String input = "hello word";
        System.out.println(input);
        Stack<Character> str = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            str.push(input.charAt(i));
        }
        StringBuilder strings = new StringBuilder();
        int size = str.size();
        for (int i = 0; i < size; i++) {
            strings.append(str.pop());
        }
        System.out.println("Array after chance: ");
        System.out.println(strings.toString());
    }
    }

