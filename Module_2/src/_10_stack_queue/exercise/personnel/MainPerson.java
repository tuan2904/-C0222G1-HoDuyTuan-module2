package _10_stack_queue.exercise.personnel;

import java.util.*;

public class MainPerson {
    public static void main(String[] args) {
        Queue<Person> NAM = new LinkedList<>();
        Queue<Person> NU = new LinkedList<>();
//        System.out.println("List before sorting: ");
        Person[] customers = new Person[5];
        customers[0] = new Person("Tuan", true, 18);
        customers[3] = new Person("Hong", false, 21);
        customers[1] = new Person("Nam", true, 19);
        customers[2] = new Person("Hai", true, 20);
        customers[4] = new Person("Yen", false, 22);


        for (Person arr : customers) {
            if (arr.isGender()) {
                NAM.add(arr);
            } else {
                NU.add(arr);
            }
        }
        List<Person> lists = new ArrayList<>();
        while (NU.size() > 0) {
            lists.add(NU.remove());
        }
        while (NAM.size() > 0) {
            lists.add(NAM.remove());
        }
        System.out.println("List after sorting: ");
        for (Person item : lists) {
            System.out.println(item.toString());
        }
    }
}
