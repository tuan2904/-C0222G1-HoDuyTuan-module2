package _17_binaryfile_serialization.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Product> products = new ArrayList<>();
    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. tìm kiếm thông tin sản phẩm");
            System.out.println("4. Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showList();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void showList() {
        products = Method.readFile();

        for (Product item : products) {
            System.out.println(item);
        }
    }

    public static void addProduct() {
        products = Method.readFile();
        while (true) {

            System.out.println("Nhập id sản phẩm");

            int id = Integer.parseInt(scanner.nextLine());
            boolean flag = true;
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getId() == id) {
                    flag = false;
                }
            }

            if (flag) {
                System.out.println("Nhập tên sản phẩm: ");
                String name = scanner.nextLine();
                System.out.println("Nhập hãng sản phẩm: ");
                String hang = scanner.nextLine();
                System.out.println("Nhập giá sản phẩm: ");
                double price = Integer.parseInt(scanner.nextLine());

                Product product = new Product(id, name, hang, price);

                products.add(product);
                System.out.println("Thêm thành công");
                try {
                    Method.writeFile( products);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            } else {
                System.out.println("Trùng tên nhập sản phẩm khác");
            }
        }
    }

    public static void searchProduct() {
        products = Method.readFile();
        System.out.println("Nhập sản phẩm");
        String nameProduct = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().toLowerCase().contains(nameProduct.toLowerCase())) {
                System.out.println(products.get(i).toString());
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Không có thông tin sản phẩm");
        }
    }
}