package _11_collection_framework.exercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        LinkedList<Product> products = new LinkedList<>();
        Product product1 = new Product("1", "Bánh", 15500);
        Product product2 = new Product("2", "kẹo", 15600);
        Product product3 = new Product("3", "Trà", 15700);
        Product product4 = new Product("4", "Kem", 15800);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        int choice = -1;
        while (choice != 7) {
            System.out.println("1.Thêm sản phẩm: ");
            System.out.println("2.Sửa thông tin sản phẩm: ");
            System.out.println("3.Xóa sản phẩm theo ID: ");
            System.out.println("4:Hiển thị danh sách sản phẩm: ");
            System.out.println("5.Tìm kiếm sản phẩm theo tên: ");
            System.out.println("6.Sắp xếp sản phẩm: ");
            System.out.println("Chọn option");
            choice = Integer.parseInt(enter.nextLine());
            switch (choice) {
                case 1:
                    Products.add();
                    break;
                case 2:
                    Products.set(products);
                    break;
                case 3:
                    Products.remove(products);
                    break;
                case 4:
                    Products.disPlay(products);
                    break;
                case 5:
                    Products.Search(products);
                    break;
                case 6:
                    Products.chance(products);
                    break;
            }
        }
    }
}
