package _02_vong_lap.exercise;
import com.sun.xml.internal.ws.api.client.WSPortInfo;

import java.util.Scanner;
public class Draw {
    public static void main(String[] args) {
        int choice = 1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            int width;
            int height;

            if (choice == 1) {
                System.out.println("Enter height");
                height = input.nextInt();
                System.out.println("Enter width");
                width = input.nextInt();
                for (int i = 1; i <= width; i++) {
                    for (int j = 1; j < height; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
            if (choice == 2){
//
                System.out.println("Enter width");
                width = input.nextInt();
                for (int i = 1; i <= width; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }

                for (int i=0;i<width;i++ ){
                    for ( int j=i;j< width-1;j++ ){
                        System.out.print(" ");
                    }
                    for (int j=0;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }

                System.out.println(" ");


                for (int i = 0; i<width;i++){
                    for (int j=0;j<i;j++){
                        System.out.print("");
                    }for (int j=i;j<width;j++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }

                System.out.println(" ");
                System.out.println("Enter width");
                width = input.nextInt();
                for (int i = width; i >=1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
//                for ()
//               for (int i=1;i<=width;i++){
//                   for (int j=i;j<width;j++){
//                       System.out.println(" ");
//                   }
//                   for (int l=1;l<=i;l++){
//                       System.out.print("*");
//                   }
//                   System.out.println(" ");
//               }
    //               System.out.println(" ");

            }
            if (choice==3){
//                System.out.println("Enter width");
//                width = input.nextInt();
                System.out.println("Enter height");
                height = input.nextInt();
                for (int i=1;i<=height;i++){
                    for (int j=height;j>i;j--){
                        System.out.print(" ");
                    }for (int l=1;l<= i*2-1;l++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
//                System.out.println("Enter width");
//                width = input.nextInt();
//                for (int i = width; i >=1; i--) {
//                    for (int j = 1; j <= i; j++) {
//                        System.out.print("* ");
//                    }
//                    System.out.println("");
//                }
            }
        }
    }

