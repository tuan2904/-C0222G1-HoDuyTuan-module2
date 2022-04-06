package _03_array_method.exercise;
import java.util.Arrays;
import java.util.Scanner;
public class MinElement {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int size = enter.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements ");
        for (int i = 0; i < array.length; i++) {
            array[i] = enter.nextInt();
        }
        System.out.println(" show arrays " + Arrays.toString(array));
        MinNumber(array);
    }
    public static void MinNumber(int[] arr){
            int min=arr[0];
            int count1=0;
            for (int i=0;i<arr.length;i++){
                if (arr[i] < min){
                    min=arr[i];
                    count1 += i;
                }
            }
        System.out.println(" The smallest element in the array is " + min + " at position " + count1 );
    }

//        int min = array[0];
//        int count1=1;
//        for (int i=0;i<array.length;i++){
//            if (array[i]<min){
//                min = array[i];
//                count1=i+1;
//            }
//        }
//        System.out.println(" The smallest element in the array is " + min + " at position " + count1 );
    }

