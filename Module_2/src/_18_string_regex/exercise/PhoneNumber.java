package _18_string_regex.exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện thoại: ");
        String number=scanner.nextLine();
//        String
        Pattern string=Pattern.compile("^[(][0-9]{1,3}[)][\b-][(](0)[0-9]{9}[)]$");

        if (string.matcher(number).find()){
            System.out.println("Số điện thoại hợp lệ: " + number);
        }else {
            System.out.println("Số điện thoại không hợp lệ: " + number);
        }
    }
}