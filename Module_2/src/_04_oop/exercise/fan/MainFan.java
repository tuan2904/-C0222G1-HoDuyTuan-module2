package _04_oop.exercise.fan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.Fan(Fan.FAST, 10, "yellow", true);
        Fan fan2 = new Fan();
        fan2.Fan(Fan.SLOW, 5, "blu", false);
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
