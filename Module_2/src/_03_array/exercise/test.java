package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {


    Scanner enter = new Scanner(System.in);
    int element = enter.nextInt();
    int[] array = new int[element];
        System.out.println("Enter array elements ");
        for (int i = 0; i < array.length; i++) {
        System.out.println(" Enter elements");
        array[i] = enter.nextInt();
    }
        System.out.println(" show arrays " + Arrays.toString(array));
//        System.out.println(" Enter the location to insert");
//    int index = enter.nextInt();
        System.out.println("Enter the number to insert ");
    int x = enter.nextInt();
//            if (index <=-1){
//        System.out.println(" out");
//        return;
//    }else if (index>= array.length-1){
//        System.out.println("Out");
//        return;
//    }
        for (int i = 0; i < array.length-1; i++) {
       if( array[i] == x){
                --x;
            }else if (array[i] != x) {
                break;
       }
            System.out.println(array[i]);
    }
        System.out.println(Arrays.toString(array));
}
}

