package _03_array.exercise;

import java.util.Arrays;

public class ArrayConcatenation {
////    public static void main(String[] args) {
////
////
////        int[] array = {2, 3, 4, 5};
////        int[] array1 = {6, 7, 8, 9};
////        int[] array2 = new int[array.length + array1.length];
////
////        System.arraycopy( array,0,array2,0,array.length);
////        System.arraycopy(array1,0,array2,array.length,array1.length);
////
////
////        System.out.println(Arrays.toString(array2));
////    }
//
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int[] array1={5,6,7,8};
        int total=array.length+array1.length;
        int[] array3= new int[total];
        int count=0;
        for( int i=0;i<array.length;i++){
                array3[count]=array[i];
                count++;
        }
        for (int i=0;i<array1.length;i++){
                array3[count]=array1[i];
                count++;
        }
        System.out.println(Arrays.toString(array3));
//     for (int i=0;i<array.length;i++ ){
//           for (int j=0;j<array1.length;j++){
//               array3[count]=array[i]+array1[j];
//            }
//       }  System.out.println(Arrays.toString(array3));






//public static void main(String[] args) {
//    int[] array = {1,2,3,4};
//    int[] array1={5,6,7,8};
//    int totalArray=array.length+array1.length;
//    int[] array3= new int[totalArray];
//    int count=0;
//    for( int i=0;i<array.length;i++){
//        array3[count]=array[i];
//        count++;
//    }
//    for (int i=0;i<array1.length;i++){
//        array3[count]=array1[i];
//        count++;
//    }
//    System.out.println(Arrays.toString(array3));
//}

}
}
