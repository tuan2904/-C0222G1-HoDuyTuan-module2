package _03_array.exercise;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;
import sun.reflect.generics.scope.MethodScope;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;
public class AddElement {
    public static void main(String[] args) {
//
//        int[] array={ 1,2,3,4,5,6};
//        System.out.println(array);
//        int x;
//        int[] array2=new int[array.length];
////        int[] array1=new int[array2.length];
//        Scanner enter=new Scanner(System.in);
//        x = enter.nextInt();
//        System.arraycopy(array,0,array2,0,array.length);
//        System.out.println(array2);
//        for (int i=0;i<array2.length ; i++){
//            if (x >=-1){
//                System.out.println("not enter");
//            }else if (x >= array2.length){
//                System.out.println("not enter");
//            }
//            else {
//                System.out.println(array2.length + x);
//            }
//        }
//        System.out.println(array2);


//        Scanner enter = new Scanner(System.in);
//        int element = enter.nextInt();
//        int[] array = new int[element];
//        System.out.println("Enter array elements ");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(" Enter elements");
//            array[i] = enter.nextInt();
//        }
//        System.out.println(" show arrays " + Arrays.toString(array));
//        System.out.println(" Enter the location to insert");
//        int index = enter.nextInt();
//        System.out.println("Enter the number to insert ");
//        int x = enter.nextInt();
////        for (int i = 0; i < array.length; i++) {
////            array[index] = array[index + 1];
//            for (int j = 0; j < array.length; j++) {
//                if (index <= -1) {
//                    System.out.println(" Not enter element");
////            array[i] = array[index];}
//                } else if (index >= array.length) {
//                    System.out.println(" Not enter element");
//                }
//            }
//                for (int i=0;i<array.length;i++){
//

//            for (int i=0;i<array.length;i++){
//                if ( index<= -1){
//                    System.out.println("not is enter");
//                    break;
//                }if (index > array.length - 1) {
//                System.out.println("not is enter");
//                break;
//            }

//            if (index <= -1) {
//                System.out.println("not is enter");
//                break;
//            }
//            if (index > array.length - 1) {
//                System.out.println("not is enter");
//                break;
//            }

//        System.out.print(Arrays.toString(array));
//            System.out.println(Arrays.toString(array));
//        for (int i=0 ; i<array1[index];i++){
//            if ( array1[index] == x){
//                System.out.println(array1[index + x]);
//            }
//        }
//        System.out.println(Arrays.toString(array1));


        Scanner enter = new Scanner(System.in);
        int element = enter.nextInt();
        int[] array = new int[element];
        System.out.println("Enter array elements ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(" Enter elements");
            array[i] = enter.nextInt();
        }
        System.out.println(" show arrays " + Arrays.toString(array));
        System.out.println(" Enter the location to insert");
        int index = enter.nextInt();
        System.out.println("Enter the number to insert ");
        int x = enter.nextInt();


        for (int i = 0; i < array.length; i++) {
            if (index <= -1 || index >= array.length - 1) {
                System.out.println(" Không thể nhập ");
                break;
            }
        }
        for (int i = array.length - 1; i >= index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = x;
        System.out.println(Arrays.toString(array));
    }
}





//        for (int i=0;i<array.length;i++){
//            if (i==x){
//                for (int j=array.length-1;j>x;j--){
//                    array[j]=array[j-1];
//                    break;
//                } System.out.println(Arrays.toString(array));
//
//            }
//        }
//        if (index <= -1) {
//            System.out.println(" out");
//            return;
//        } else if (index >= array.length - 1) {
//            System.out.println("Out");
//            return;
//        }
//        for (int i = 0; i < array.length; i++) {
//            array[index] = x;
//
//        }
//        System.out.println(Arrays.toString(array));


