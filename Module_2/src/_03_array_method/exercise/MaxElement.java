package _03_array_method.exercise;


public class MaxElement {
//    public static void main(String[] args) {
//        int [][] array={
//                {1,2,3,4,5},
//                {6,7,8,9}
//        };
//        int[] array1=new int[ array[0].length + array[1].length];
////        Scanner number= new Scanner(System.in);
//        System.arraycopy(array,0,array1,0,array.length);
//        System.arraycopy(array,0,array1,array.length,array.length);
//    }
public static void main(String[] args) {
    int[][] array = {
            {1, 2, 3, 4},
            {5, 9, 7, 8, 6}
    };

    MaxNumber(array);
}
public static void MaxNumber(int arr[][]){
    int max = arr[0][0];
    for (int i=-0;i<arr.length;i++){
        for (int j=0;j<arr[i].length;j++){
            if(arr[i][j]>max){
                max=arr[i][j];
            }
        }
    }System.out.println(" The largest element in the array is " + max );
}







//
//    int max=array[0][0];
//    for (int i=0;i<array.length;i++){
//        for (int j=0;j<array[i].length;j++){
//            if (array[i][j]>max){
//                max=array[i][j];
//            }
//        }
//    }  System.out.println(" The largest element in the array is " + max );






//    int array2=array[0].length+array[1].length;
//    int[] array3= new int[array2];
//    int count=0;
//    for( int i=0;i<array[0].length;i++){
//        array3[count]=array[0][i];
//        count++;
//    }
//    for (int i=0;i<array[1].length;i++){
//        array3[count]=array[1][i];
//        count++;
//    }
//    System.out.println(Arrays.toString(array3));
//
//    int max=array3[0];
//    int count1=1;
//    for (int i=0;i<array3.length;i++){
//        if (array3[i]>max){
//            max = array3[i];
//            count1=i+1;
//        }
//    }
//    System.out.println(" The largest element in the array is " + max + " at position " + count1 );
}

