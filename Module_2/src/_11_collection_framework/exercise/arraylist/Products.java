package _11_collection_framework.exercise.arraylist;

import java.util.*;

public class Products {
    public  void add(ArrayList<Product> products) {
        Scanner enter = new Scanner(System.in);
        for (Product item : products) {
            System.out.println("Nhập id: ");
            String id = enter.nextLine();
            if (item.getId().equals(id)) {
                System.out.println("Đã có sản phẩm này");
                System.out.println("Mời nhập lại sản phẩm mới. ");
                break;
            } else if (!item.getId().equals(id)) {
                System.out.println("mời thêm sản phẩm");
                break;
            }
        }
        System.out.println("Nhập sản phẩm mới: ");
        System.out.println("Nhập id: ");
        String id = enter.nextLine();

        System.out.println("Nhập tên: ");
        String name = enter.nextLine();

        System.out.println("Nhập giá: ");
        int price = Integer.parseInt(enter.nextLine());
        Product product = new Product(id, name, price);
        products.add(product);
        disPlay(products);
    }

    public  void remove(ArrayList<Product> products) {
        disPlay(products);
        Scanner enter = new Scanner(System.in);
        System.out.println("Nhập ID muốn xóa: ");
        String id = enter.nextLine();
        boolean flag = false;
        for (Product item : products) {
            if (item.getId().equals(id)) {
                flag = true;
                products.remove(item);
                break;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy");
        }
        disPlay(products);
    }


    public  void search(ArrayList<Product> products) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Nhập tên muốn tìm: ");
        String name = enter.nextLine();
        boolean flag = false;
        for (Product item : products) {
            if (item.getProductName().contains(name)) {
                flag = true;
                System.out.println("Có sản phẩm:" + item);
                break;
            }
//            } else {
//                System.out.println(" Không có sản phẩm muốn tìm");
//                break;
//            }
        }
        if (!flag) {
            System.out.println("Không có sản phẩm này");
        }
    }

//    public static void contains(Object o) {
//        Scanner enter = new Scanner(System.in);
//        System.out.println("Nhập tên muốn tìm: ");
//        String name = enter.nextLine();
////        for (int i=0;i<products.size();i++){
////       if (products.get(i).equals(name)) {
//        for(Product item : products){
//            if (products.contains(name)){
//                System.out.println("sản phảm can tìm " + products);
//            }
//    }
//            System.out.println("Có sản phẩm: " + products);
//            break;
//        }else {
//            System.out.println("not");
////        }
//        }
//    }

    public  void sort(ArrayList<Product> products) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Chọn cách thức sắp xếp");
        System.out.println("1. Sắp xếp tăng dần");
        System.out.println("2. Sắp xếp giảm dần");

        int chose = enter.nextInt();
        switch (chose) {
            case 1:
                sortUpAscending(products);
                break;
            case 2:
                sortDescending(products);
                break;
        }
    }

    public  void sortUpAscending(ArrayList<Product> products) {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        });
        disPlay(products);
    }

    public  void sortDescending(ArrayList<Product> products) {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        disPlay(products);
    }

    public  void set(ArrayList<Product> products) {
        System.out.println("Danh sách sản phẩm: ");
        disPlay(products);
        Scanner enter = new Scanner(System.in);
        System.out.println("Nhập id cần thay đổi: ");
        String id = enter.nextLine();
//        boolean flag=false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(id)) {
                products.remove(i);
//                flag=true;
                System.out.println("Mời nhập lại ID sản phẩm: ");
                String Id = enter.nextLine();
                System.out.println("Mời nhập tên sản phẩm: ");
                String name = enter.nextLine();
                System.out.println("Mời nhập giá sản phẩm: ");
                double price = enter.nextDouble();
                Product product = new Product(Id, name, price);
                products.add(i, product);
                System.out.println("Thêm thành công");
//                disPlay(products);
                break;
            }
        }
        disPlay(products);
    }

    public  void disPlay(ArrayList<Product> products) {
        for (Product item : products) {
            System.out.println(item.toString());
        }
    }

}

