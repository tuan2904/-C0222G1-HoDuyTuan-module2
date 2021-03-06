package _11_collection_framework.exercise.linkedlist;

public class Product {
    private String id;
    private String productName;
    private double price;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Product() {
    }

    public Product(String id, String productName, double price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID:" + id
                + ",ProductName: " + productName
                + ", Price: " + price;
    }
}
