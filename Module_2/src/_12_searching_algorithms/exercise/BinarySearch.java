package _12_searching_algorithms.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner enter=new Scanner(System.in);
        System.out.println("Nhập số phần tử muốn thêm vào mảng: ");
        int size = enter.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử: ");
            array[i] = enter.nextInt();
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Mảng sau khi sắp xếp: ");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
