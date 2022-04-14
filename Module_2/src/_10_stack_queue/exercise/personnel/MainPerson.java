package _10_stack_queue.exercise.personnel;

import java.util.*;

public class MainPerson {
    public static void main(String[] args) {
       Queue<Person> NAM = new LinkedList<>();
        Queue<Person> NU = new LinkedList<>();
//        System.out.println("List before sorting: ");
        Person[] customers = new Person[5] ;
        customers[0] = new Person("Tuan", true, 18);
        customers[1] = new Person("Nam", true, 19);
        customers[2] = new Person("Hai", true, 20);
        customers[3] = new Person("Hong", false, 21);
        customers[4] = new Person("Yen", false, 22);

        
        for (Person item : customers) {
            if (item.isGender()){
                NAM.add(item);
            } else {
                NU.add(item);
            }
        }
        List<Person> orderedList = new ArrayList<>();
        while (NU.size() > 0){
            orderedList.add(NU.remove());
        }
        while (NAM.size() > 0){
            orderedList.add(NAM.remove());
        }
        System.out.println("List after sorting: ");
        for (Person item: orderedList) {
            System.out.println(item.toString());
        }
    }
    }
