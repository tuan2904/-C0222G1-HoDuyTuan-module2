package _03_array.exercise;
import java.util.Scanner;
public class KyTu {
    public static void main(String[] args) {
        String str;
        char characters='a';
        int count=0;
        Scanner enter=new Scanner(System.in);
        System.out.println("Enter in string characters");
        str=enter.nextLine();
        for (int i=0;i<str.length();i++){
            if ( str.charAt(i) == characters){
                    count++;
            }
        }
        System.out.println("number of occurrences of the character " + characters + " is " + count);
    }
}
