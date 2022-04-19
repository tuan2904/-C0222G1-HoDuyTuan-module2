package _12_searching_algorithms.exercise;

import java.util.LinkedList;

public class StringAscending {
    public static void main(String[] args) {
        LinkedList<Character> strings = new LinkedList<>();
        LinkedList<Character> string1 = new LinkedList<>();
        String string = "Welcome";
        for (int i = 0; i < string.length(); i++) {
            string1.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > string1.getLast()) {
                    string1.add(string.charAt(j));
                }
            }
            if (string1.size() > strings.size()) {
                strings.clear();
                strings.addAll(string1);
            }
            string1.clear();
        }
        for (Character m : strings) {
            System.out.println(m);
        }
    }
}

