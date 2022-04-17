package _10_stack_queue.exercise.personnel;

import java.util.*;

public class MainPerson {
    public static void main(String[] args) {
        Queue<Person> nam = new LinkedList<>();
        Queue<Person> nu = new LinkedList<>();
//        System.out.println("List before sorting: ");
        Person[] customers = new Person[5];
        customers[0] = new Person("Tuan", true, 18);
        customers[3] = new Person("Hong", false, 21);
        customers[1] = new Person("Nam", true, 19);
        customers[2] = new Person("Hai", true, 20);
        customers[4] = new Person("Yen", false, 22);


        for (Person arr : customers) {
            if (arr.isGender()) {
                nam.add(arr);
            } else {
                nu.add(arr);
            }
        }
        List<Person> lists = new ArrayList<>();
        while (nu.size() > 0) {
            lists.add(nu.remove());
        }
        while (nam.size() > 0) {
            lists.add(nam.remove());
        }
        System.out.println("List after sorting: ");
        for (Person item : lists) {
            System.out.println(item.toString());
        }
    }
}
