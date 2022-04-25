package casestudy.controllers;

import casestudy.services.EmployeeService;
import casestudy.services.impl.CustomerServiceIml;
import casestudy.services.impl.EmployeeServiceIml;

import java.util.Scanner;

public class FuramaController {
    static CustomerServiceIml customerServiceIml= new CustomerServiceIml();
    static EmployeeServiceIml employeeService=new EmployeeServiceIml() ;
    public static void main(String[] args) {
        displayMainMenu();
    }
    Scanner enter = new Scanner(System.in);
    public static void displayMainMenu() {
        Scanner enter = new Scanner(System.in);
        int choice = -1;
        while (true) {
            System.out.println("1.Employee Management: ");
            System.out.println("2.Customer Management: ");
            System.out.println("3.Facility Management: ");
            System.out.println("4.Booking Management: ");
            System.out.println("5.Promotion Management: ");
            System.out.println("6.Exit: ");
            choice = Integer.parseInt(enter.nextLine());
            switch (choice) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Nhập lại");
                    break;
            }
        }
    }

    public static void employeeManagement() {
        Scanner enter = new Scanner(System.in);
        int choice ;
        while (true) {
            System.out.println("1\tDisplay list employees");
            System.out.println("2\tAdd new employee ");
            System.out.println("3\tEdit employee ");
            System.out.println("4\tReturn main menu ");
            choice = Integer.parseInt(enter.nextLine());

            switch (choice){
                case 1:
                    employeeService.display();
                    break;
                case 2:employeeService.addNew();
                    break;
                case 3:employeeService.edit();
                    break;
                case 4:
                    break;
            }
        }
    }

    public static void facilityManagement() {
        Scanner enter = new Scanner(System.in);
        int choice = -1;
        while (choice != 5) {
            System.out.println("1\tDisplay list facility");
            System.out.println("2\tAdd new facility ");
            System.out.println("3\tDisplay list facility maintenance ");
            System.out.println("4\tReturn main menu ");
            choice = Integer.parseInt(enter.nextLine());

            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    }

    public static void customerManagement() {
        Scanner enter = new Scanner(System.in);
        int choice = -1;
        while (true) {
            System.out.println("1\tDisplay list facility");
            System.out.println("2\tAdd new customer ");
            System.out.println("3\tEdit customer ");
            System.out.println("4\tReturn main menu ");
            choice = Integer.parseInt(enter.nextLine());

            switch (choice){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    }

    public static void bookingManagement() {
        Scanner enter = new Scanner(System.in);
        int choice = -1;
        while (true) {
            System.out.println("1.Add new booking");
            System.out.println("2.Display list booking ");
            System.out.println("3.Create new contracts  ");
            System.out.println("4.Display list contracts ");
            System.out.println("5.Edit contracts ");
            System.out.println("6.Return main menu ");
            choice = Integer.parseInt(enter.nextLine());

            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    }

    public static void promotionManagement() {
        Scanner enter = new Scanner(System.in);
        int choice = -1;
        while (true) {
            System.out.println("Promotion Management");
            System.out.println("2.\tDisplay list customers get voucher ");
            System.out.println("3.\tReturn main menu ");
            choice = Integer.parseInt(enter.nextLine());
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    }
}
