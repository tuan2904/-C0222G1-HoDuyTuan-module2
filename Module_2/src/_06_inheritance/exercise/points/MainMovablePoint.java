package _06_inheritance.exercise.points;

public class MainMovablePoint extends MainPoints  {
    public static void main(String[] args) {
     MovablePoint mainMovablePoint= new MovablePoint(3,4);

        System.out.println(mainMovablePoint);

        MovablePoint movablePoint=new MovablePoint(1,2,4,5);
        System.out.println(movablePoint.move());
    }
}
