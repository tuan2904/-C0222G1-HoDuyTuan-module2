package _extra_exercises;

import java.util.Scanner;

public class Main {
    public static Person[] person = new Person[5];

    public static void main(String[] args) {

        person[0] = new Teacher("Tuan", 351
                , false, 20000);
        person[1] = new Student("Nam", 20, true, 9);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. show list");
            System.out.println("2. add student");
            System.out.println("3. add teacher");
            System.out.println("4. delete student");
            System.out.println("5. delete teacher");
            System.out.println("6. exit");
            System.out.println(" option");


            int choose = Integer.parseInt(scanner.nextLine());
            if (choose == 6) {
                break;
            }
            switch (choose) {
                case 1:
                    showList();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    addTeacher();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    deleteTeacher();
                    break;
            }
        }
    }

    public static void showList() {
        for (int i = 0; i < 5; i++) {
            if (person[i] != null) {
                System.out.println(person[i]);
            }
        }
    }

    public static void addStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("name: ");

        String name = input.nextLine();
        System.out.println("age: ");

        int age = Integer.parseInt(input.nextLine());
        System.out.println("point: ");

        int point = Integer.parseInt(input.nextLine());
        System.out.println("" +
                "Gender : 1 nam,  2 nu");
        boolean gender = false;
        int choice = Integer.parseInt(input.nextLine());

        if (choice == 1) {
            gender = true;
        } else if (choice == 2) {
            gender = false;
        }
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (person[i] == null) {
                index = i;
                break;
            }
        }
        person[index] = new Student(name, age, gender, point);
        showList();
    }

    public static void addTeacher() {
        Scanner inputs = new Scanner(System.in);
        System.out.println("Name teacher: ");

        String name = inputs.nextLine();
        System.out.println("age: ");

        int age = Integer.parseInt(inputs.nextLine());
        System.out.println("salary: ");

        int salary = Integer.parseInt(inputs.nextLine());
        System.out.println("Gender : 1 nam , 2 nu");
        boolean gender = false;
        int choice = Integer.parseInt(inputs.nextLine());
        if (choice == 1) {
            gender = true;
        }
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (person[i] == null) {
                index = i;
                break;
            }
        }
        person[index] = new Teacher(name, age, gender, salary);

        System.out.println("After add");
        showList();
    }

    public static void deleteStudent() {
        System.out.println("before delete");
        showList();
        Scanner inputs = new Scanner(System.in);
        System.out.println("delete name");
        String name = inputs.nextLine();
        for (int i = 0; i < 10; i++) {
            if (name.equals(person[i].getName())) {
                person[i] = null;
                System.out.println("After list");
                showList();
                break;
            }
        }

    }

    public static void deleteTeacher() {
        System.out.println("before name");
        showList();
        Scanner inputs = new Scanner(System.in);
        System.out.println("delete name ");
        String name = inputs.nextLine();
        for (int i = 0; i < person.length; i++) {
            if (name.equals(person[i].getName())) {
                person[i] = null;
                System.out.println("After list");
                showList();
                break;
            }
        }
    }
}