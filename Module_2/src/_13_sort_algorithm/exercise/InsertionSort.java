package _13_sort_algorithm.exercise;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        int elements, element;
        for (int i = 1; i < list.length; i++) {
            elements = list[i];
            element = i;
            while (element > 0 && elements < list[element - 1]) {
                list[element] = list[element - 1];
                element--;
            }
            list[element] = elements;
        }
    }

    public static void main(String[] args) {
        int[] array = {6, 3, 7, 2, 54, 24, 7};
        System.out.println("Array at first: ");
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(array));
    }
}
