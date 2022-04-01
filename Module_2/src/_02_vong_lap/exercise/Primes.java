package _02_vong_lap.exercise;

import javax.crypto.spec.PSource;

public class Primes {
    //    public static void main(String[] args) {
//        int count = 0;
////        System.out.println("Enter primes");
////        int enter = number.nextInt();
//        while (count<100){
//         if (count<2){
//                return
//         }
//        }
//    }
//    public static void main(String[] args) {
//
//        String str="";
//        for (int i=1;i<100;i++){
//            int count = 0;
//
//            for (int j=i;j>1;j++){
//            if (j%i==0){
//              count=count+1;
//            }
//        }
//            if (count==2){
//                str= str + i ;
//            }
//        }
//        System.out.println(str);
//        for (int i=0;i < 100;i++){
//            if ( number % i ==0 ){
//                number1++;
//            }
//        }if (number1==0 & number > 1){
//            System.out.println( );
//        }
//    int number = 0;
//    public static void isnumber(int number) {
//            if (number < 2) {
//
//            }

    public static void main(String[] args) {
        int count = 0;
        while (count < 100) {
            boolean check = true;
            if (count < 2) {
                check = false;
            } else {
                for (int i = 2; i < count; i++) {
                    if (count % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check){
                    System.out.println( count );
                }
            }
            count++;
        }
    }

}


