package _07_abstractClass_interface.exercise.colorable;


public class MainColorable {
    public static void main(String[] args) {

        Shape[] shape = new Shape[3];
        shape[0] = new Circle("green", true, 4);
        shape[1] = new Rectangle("Black", true, 7, 6);
        shape[2] = new Square("red", true, 8);

        for (Shape shapes : shape) {
            if (shapes instanceof Square) {
                Square square = (Square) shapes;
                square.howToColor();
            }
            System.out.println(shapes);
        }
    }
}
