package _03_array_method.exercise;
import java.util.Scanner;
public class Character {
    public static void main(String[] args) {
        String str;
        char character='a';
//        int count=0;
        Scanner enter=new Scanner(System.in);
        System.out.println("Enter in string characters");
        str=enter.nextLine();
//        for (int i=0;i<str.length();i++){
//            if ( str.charAt(i) == characters){
//                    count++;
//            }
//        }
//        System.out.println("number of occurrences of the character " + characters + " is " + count);
        Characters(str,character);
    }
    public static void Characters(String str1,char characters){
        int count=0;
        for (int i=0;i<str1.length();i++){
            if ( str1.charAt(i) == characters){
                count++;
            }
        }
        System.out.println("number of occurrences of the character " + characters + " is " + count);
    }
}
