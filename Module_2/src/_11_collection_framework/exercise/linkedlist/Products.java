package _11_collection_framework.exercise.linkedlist;

import java.util.*;

public class Products {


    public static void add() {
        LinkedList<Product> products = new LinkedList<>();
        Scanner enter = new Scanner(System.in);
        System.out.println("Nhập id: ");
        String id = enter.nextLine();
        System.out.println("Nhập tên: ");
        String name = enter.nextLine();
        System.out.println("Nhập giá: ");
        int price = Integer.parseInt(enter.nextLine());
        Product product = new Product(id, name, price);
        products.add(product);

        System.out.println(products);

    }

    public static void remove(LinkedList<Product> products) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Nhập ID muốn xóa: ");
        String id = enter.nextLine();
        for (Product item : products) {
            if (item.getId().equals(id)) {
                products.remove(item);
                break;
            } else {
                System.out.println("Không có sản phẩm muốn xóa");
            }
        }
        disPlay(products);
    }

    public static void Search(LinkedList<Product> products) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Nhập tên muốn tìm: ");
        String name = enter.nextLine();
        boolean flag = false;

        for (Product item : products) {
            if (item.getProductName().equals(name)) {
                System.out.println(item.toString());
                flag = true;
            } else {
                flag = false;

            }
        }
    }

    public static void chance(LinkedList<Product> products) {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        });
        disPlay(products);
    }

    public static void chances(LinkedList<Product> products) {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        disPlay(products);
    }

    public static void set(LinkedList<Product> products) {
        Scanner enter = new Scanner(System.in);
        System.out.println("id");
        String id = enter.nextLine();

        System.out.println("Tên");
        String name = enter.nextLine();

        System.out.println("Giá");
        int price = enter.nextInt();
        for (Product item : products) {
            if (item.getId().equals(id)) {
                products.remove(item);
                products.add(new Product(id, name, price));
                disPlay(products);
                break;
            } else {
                System.out.println("Không có id này: ");
            }
        }
    }

    public static void disPlay(LinkedList<Product> products) {
        for (Product item : products) {
            System.out.println(item);
        }
    }

}
