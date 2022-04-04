package _03_array.exercise;
import java.util.Arrays;
import java.util.Scanner;
public class TotalElement {
    public static void main(String[] args) {
        int dong, cot;
        Scanner enter = new Scanner(System.in);
        System.out.println(" enter dong");
        dong = enter.nextInt();
        System.out.println("enter cot");
        cot = enter.nextInt();
        TotalColumn(dong,cot);
    }
    public static void TotalColumn(int column, int line){
        int total = 0;
        Scanner enter = new Scanner(System.in);
        int[][] array = new int[column][line];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < line; j++) {
                System.out.println("Enter element [" + i + ", " + j + "]: ");
                array[i][j] = enter.nextInt();
            }
        }
        System.out.println(" Mảng vừa nhập: ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < line; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
        System.out.println(" ");
        System.out.println(" Nhập cột");
        int index = enter.nextInt();


        for (int i=0;i<column;i++) {
            for (int j = 0; j < line; j++) {
                if (j == index) {
                    total += array[i][index];
                }
            }
        }
        System.out.println(" Total element: " + total);

    }
//        int[][] array = new int[dong][cot];
//        int totals=0;
//        for (int i = 0; i < dong; i++) {
//            for (int j = 0; j < cot; j++) {
//                System.out.println("Enter element [" + i + ", " + j + "]: ");
//                array[i][j] = enter.nextInt();
//            }
//        }
//        System.out.println(" Mảng vừa nhập: ");
//        for (int i = 0; i < dong; i++) {
//            for (int j = 0; j < cot; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//        }
//        System.out.println(" ");
//        System.out.println(" Nhập cột");
//        int index = enter.nextInt();
//
//
//        for (int i=0;i<dong;i++) {
//            for (int j = 0; j < cot; j++) {
//                if (j == index) {
//                    total += array[i][index];
//                }
//            }
//        }
//        System.out.println(" Total element: " + total);

}








//            public static void AddCot(int b, int[][] arr){
//        int sum=0;
//                Scanner enter=new Scanner(System.in);
//                System.out.println(" Nhập cột muốn tính");
//                int l= enter.nextInt();
//                for (int i=0;i<b;i++){
//                        sum+=arr[i][l];
//                    }
//                System.out.println(sum);




