package casestudy.services.impl;

import casestudy.controllers.FuramaController;
import casestudy.models.Employee;

import casestudy.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceIml implements EmployeeService {
   static List<Employee> list=new ArrayList<>();
   public Scanner scanner=new Scanner(System.in);
    @Override
    public void display() {
        for (Employee lists:list) {
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
        String email=scanner.nextLine();
        System.out.println("Nhập chức vụ");
        String level=scanner.nextLine();
        System.out.println("Nhập vị trí");
        String position=scanner.nextLine();
        System.out.println("Nhập luong");
        int salary=scanner.nextInt();
        Employee employee=new Employee(id,name,age,gender,idCar,email,level,position,salary);
        list.add(employee);
        display();
    }

    @Override
    public void edit() {
        System.out.println("Nhập name muốn tim: ");
        String name=scanner.nextLine();
        for (Employee e:list) {
            if (e.getName().contains(name)){
                System.out.println(e);
            }
        }display();
    }

    @Override
    public void delete() {

    }
}
