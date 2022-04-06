package _03_array_method.exercise;
import java.util.Scanner;
public class DiagonalMatrix {
    public static void main(String[] args) {
        int dong,cot;
        Scanner enter=new Scanner(System.in);
        System.out.println(" Enter column");
        dong=enter.nextInt();
        System.out.println("Enter line");
        cot=enter.nextInt();
        int [][] array=new int[dong][cot];
        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                System.out.println(" Element [" + i +"], [" + j +  "] : ");
                array[i][j]=enter.nextInt();
            }
        }
        System.out.println( " Arrays can be created :" );
        for ( int i=0;i<dong;i++){
            for ( int j=0;j<cot;j++){
                System.out.print( array[i][j] + " ");
            }
            System.out.println();
        }
        int sum1=0;
        int sum=0;
        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                if (i==j){
                    sum += array[i][j];
                }
            }
        }  System.out.println( " Sum of numbers on the 1st diagonal : "  + sum );
        for (int i=0;i<array.length;i++){
            sum1+=array[i][array.length-1-i];
        }
        System.out.println(" Sum of numbers on the 2st diagonal : " + sum1);
        System.out.println( " Sum of 2 diagonals : "  + sum + sum1);
    }
}
