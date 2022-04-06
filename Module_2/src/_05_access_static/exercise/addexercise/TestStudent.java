package _05_access_static.exercise.addexercise;
import java.util.Scanner;
public class TestStudent {
        static Scanner sc = new Scanner(System.in);
        static Student1[] arr = new Student1[10];
        public static void main(String[] args) {
            arr[0] = new Student1("Tuan",44,"Hai Phong",7);
            arr[1] = new Student1("nam", 22, "Da Nang", 8);
            arr[2] = new Student1("le", 12, "Hue", 9);
            arr[3] = new Student1("Dung", 24, "Ha Noi", 10);
            System.out.println("Menu");
            System.out.println("1. Display: ");
            System.out.println("2. Add: ");
            System.out.println("3.Delete: ");
            System.out.println("Enter your choice");
            int choice = -1;
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    delete();
                    break;
            }
        }
        public static void display() {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) {
                    System.out.println(arr[i]);
                }
            }
        }
        public static void add() {
            System.out.println("Nhập tên học sinh: ");
            String name = sc.nextLine();
            System.out.println("Nhập tuổi: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập địa chỉ: ");
            String address = sc.nextLine();
            System.out.println("Nhập điểm: ");
            int point = Integer.parseInt(sc.nextLine());
            Student1 newStudent = new Student1(name, age, address, point);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == null) {
                    arr[i] = newStudent;
                    break;
                }
            }
            display();
        }
        public static void delete() {
            System.out.println(" Nhap vi tri muon xoa: ");
            int index = sc.nextInt();
            for (int i = index; i < arr.length; i++) {
                if (arr[i] != null) {
                    arr[i] = arr[i + 1];
                }
            }
            display();
        }


}
