package _03_array.exercise;
import java.util.Arrays;
import java.util.Scanner;
public class jdsa {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,5,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn xóa: ");
        int k = sc.nextInt();
        int c = 0, i;
        for ( i = 0; i < arr.length ;) {
            if (arr[i] == k){
                c = i;
                break;
            }else {
                i++;
            }
        }
        for (int j = c; j < arr.length ; j++) {
            if (j == arr.length - 1){
                arr[j] = 0;
            }else {
                arr[j] = arr[j + 1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
