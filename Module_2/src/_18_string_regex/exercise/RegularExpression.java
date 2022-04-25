package _18_string_regex.exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi: ");
        Scanner enter = new Scanner(System.in);
        String test = enter.nextLine();
         Pattern pattern = Pattern.compile("^[ACP][0-9]{4}[GHJKLM]$");
            if (pattern.matcher(test).find()) {
                System.out.println("Lớp hợp lệ: " + test);
            } else {
                System.out.println("Lớp không hợp lệ: " + test);
            }
        }
    }
