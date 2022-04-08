package _07_abstractClass_interface.practice.animal_interface;

import _07_abstractClass_interface.practice.animal_interface.Apple;
import _07_abstractClass_interface.practice.animal_interface.Fruit;
import _07_abstractClass_interface.practice.animal_interface.Orange;

public class MainFruit {
    public static void main(String[] args) {
        Fruit[] fruit= new Fruit[2];
        fruit[0]=new Orange();
        fruit[1]=new Apple();
        }
    }

