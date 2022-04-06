package _04_oop.exercise.stopwatch;

import java.util.Arrays;

public class StopWatch {
    private double startTime;
    private double endTime;

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return (endTime - startTime);
    }

//    public static void main(String[] args) {
//        StopWatch watch=new StopWatch();
//        watch.start();
//        System.out.println(" Start time: " + watch.getStartTime() );
//        int[] arr=new int [100000];
//        for (int  i=0;i<arr.length;i++){
//            arr[i]=(int) + Math.floor(Math.random()*100000);
//        }
//        for ( int i=0;i<arr.length;i++){
//            int max=arr[i];
//            for (int j=i;j<arr.length-i;j++){
//                if (max <arr[j]){
//                    max=arr[j];
//                    arr[j]=arr[i];
//                    arr[i]=max;
//                }
//            }
//        }
//        watch.stop();
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Stop time : " + watch.getEndTime());
//        System.out.println("thời gian đã qua " + watch.getElapsedTime()+" milisecond ");
//
//    }
}
