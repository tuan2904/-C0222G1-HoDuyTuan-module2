package _03_array.exercise;
import java.util.Arrays;
import java.util.Scanner;
public class TotalElement {
    public static void main(String[] args) {
       int dong,cot;
       int total=0;
       Scanner enter=new Scanner(System.in);
        System.out.println(" enter dong");
        dong=enter.nextInt();
        System.out.println("enter cot");
        cot=enter.nextInt();
        int [][] array= new int[dong][cot];
//        System.out.println(Arrays.toString(array));
        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                System.out.println("Enter element [" + i + ", " + j + "]: ");
                array[i][j]=enter.nextInt();
            }
        }
        System.out.println(" Mảng vừa nhập: ");
        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                System.out.print(array[i][j] + "\t" );
            }
        }
        System.out.println(" ");

              for (int i=0;i<dong;i++){
                  for (int j=0;j<cot;j++){
                      total+= array[i][j];
                  }
              }
        System.out.println(" Total element: " + total);

    }
}
