package _13_sort_algorithm.exercise;
import java.util.Arrays;
import java.util.Scanner;
public class IllustrateInsertionSort {
    public static void main(String[] args) {
        int[] array={3,6,2,1,3};
        int element, elements;
        for (int i = 1; i < array.length; i++) {
            elements = array[i];
            element = i;
            while (element > 0 && elements < array[element - 1]) {
                array[element] = array[element - 1];
                element--;
            }
            array[element] = elements;
            System.out.println("Array after sorting:  ");
            System.out.println(Arrays.toString(array));


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter list size:");
//        int size = scanner.nextInt();
//        int[] list = new int[size];
//        System.out.println("Enter " + list.length + " values:");
//        for (int i = 0; i < list.length; i++) {
//            list[i] = scanner.nextInt();
//        }
//        System.out.print("Your input list: ");
//        for (int value : list) {
//            System.out.print(value + "\t");
//        }
//        insertionSort(list);
//        System.out.println(" ");
//        System.out.println("Array after sort: ");
//        System.out.println(Arrays.toString(list));
//    }
//


//    public static void insertionSort(int[] array) {
//        int element,elements;
//        for (int i=1;i<array.length;i++){
//            elements=array[i];
//            element=i;
//            while (element > 0 && elements<array[element-1]){
//                array[element] = array[element -1];
//                element--;
//            }
//            array[element] = elements;
//        }


//        int pos, x;
//        for (int i = 1; i < array.length; i++) {
//            x = array[i];
//            pos = i;
//            while (pos > 0 && x < array[pos - 1]) {
//                array[pos] = array[pos - 1];
//                pos--;
//            }
//            array[pos] = x;
//        }
        }
    }
}