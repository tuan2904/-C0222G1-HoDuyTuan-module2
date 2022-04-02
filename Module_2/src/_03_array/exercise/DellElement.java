package _03_array.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DellElement {
    public static void main(String[] args) {
        Scanner enters = new Scanner(System.in);
        int elements = enters.nextInt();
        int[] array = new int[elements];
        int count=0;
        System.out.println("Enter elements ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(" Enter elements");
            array[i] = enters.nextInt();
        }
        System.out.println(" show arrays " + Arrays.toString(array));
        System.out.println(" Enter the location to insert");
        int x = enters.nextInt();
        for (int j=0;j<array.length;j++) {
            if (array[j] == x) {
                count += j;
            }
        }
            System.out.println("position of x "  + count);
        System.out.println(" Enter the location to insert");
        x = enters.nextInt();
        int i;
        for (i=0;i<array.length;i++) {
            if (array[i] != x) {
                return;
            }else if (array[i] == x) {
                       array[i]=array.length-1;

            }

        }System.out.println(array[i]);
//        System.out.println(Arrays.toString(array));




//
//            System.out.println(Arrays.toString(array1));
//        List<int>list = new ArrayList<Integer>();
//                for (int i=0;i<array.length-1;i++){
//                    if (array[i] != x){
//                        list.add(array[i]);
//                    }
//                }
//                array=list.toArray(new int[0]);
//                }




}}
