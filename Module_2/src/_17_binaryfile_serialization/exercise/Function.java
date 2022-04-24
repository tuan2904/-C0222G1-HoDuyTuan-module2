package _17_binaryfile_serialization.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Function {
    private static final String PRODUCT="src\\_17_binaryfile_serialization\\exercise\\productfile.txt";
    public static void writeFile( List<Product> product) throws IOException {
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(new File(PRODUCT));
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(product);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            objectOutputStream.close();
        }
    }

    public static List<Product> readFile() {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        List<Product> productList = new ArrayList<>();
        try {
            fileInputStream = new FileInputStream(new File(PRODUCT));
            objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
        }
        return productList;
    }
}
