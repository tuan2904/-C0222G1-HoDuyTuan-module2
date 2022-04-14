package _10_stack_queue.exercise;



import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        Stack<String> stack = new Stack<>();
        String []strings=str.split("");

        String flag;
        String string;
        for (int i=0;i<strings.length;i++){

            if (strings[i].equals("(") ){
                stack.push(strings[i]);
            } if (strings[i].equals(")")){
                if (stack.isEmpty()){
                    flag="false";
                }string=stack.pop();
                if (string.equals(strings[i])){
                    flag="false";
                }
            }
        }
        if (stack.isEmpty()){
            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }
}
