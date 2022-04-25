package casestudy.services.impl;

import casestudy.models.Customer;

import casestudy.services.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceIml implements CustomerService {
    static List<Customer> list=new ArrayList<>();
    public Scanner scanner=new Scanner(System.in);
    @Override
    public void display() {
        for (Customer lists:list) {
            System.out.println(lists.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name");
        String name=scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính");
        String gender =scanner.nextLine();
        System.out.println("Nhập cmnd");
        int idCar=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email:");
//        String email=scanner.nextLine();
//        System.out.println("Nhập chức vụ");
//        String level=scanner.nextLine();
//        System.out.println("Nhập vị trí");
//        String position=scanner.nextLine();
//        System.out.println("Nhập luong");
//        int salary=scanner.nextInt();
        Customer customer=new Customer(id,name,age,gender,idCar);
        list.add(customer);
        display();
    }

    @Override
    public void edit() {
        System.out.println("Nhập name muốn tim: ");
        String name=scanner.nextLine();
        for (Customer e:list) {
            if (e.getName().contains(name)){
                System.out.println(e);
            }
        }display();
    }

    @Override
    public void delete() {

    }
}
