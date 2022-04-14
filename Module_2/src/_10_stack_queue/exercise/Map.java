package _10_stack_queue.exercise;

import java.util.Scanner;
import java.util.TreeMap;

public class Map {
    public void Map(String string) {
        String[] strings = string.split(" ");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (String s : strings) {
            if (treeMap.containsKey(s)) {
                treeMap.put(s, treeMap.get(s) + 1);
            } else {
                treeMap.put(s, 1);
            }
        }
        System.out.println(treeMap);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map map = new Map();
        String string = input.nextLine().toLowerCase();
        map.Map(string);
    }
}
