package _05_access_static.practice.Car;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3 ", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car(" Mazda 6 ", "Skyactiv 6");
        System.out.println(Car.numberOfCars);

    }
}
