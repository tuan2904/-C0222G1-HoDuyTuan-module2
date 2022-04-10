package _07_abstractClass_interface.exercise.colorable;


public class MainColorable {
    public static void main(String[] args) {

        Shape[] shape = new Shape[3];
        shape[0]=new Circle(7);
        shape[1]=new Rectangle(7,8);
        shape[2]=new Square("red",true,8);


        for (Shape shapes : shape
        ) {
            System.out.println(" Area of  : ");
            System.out.println(shapes.getArea());

            if (shapes instanceof Square) {
                Square square = (Square) shapes;
                System.out.println(" how to color ");
                square.howToColor();
            }
        }
    }
}
