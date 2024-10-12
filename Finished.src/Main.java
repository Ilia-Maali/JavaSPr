import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(10));
        shapes.add(new Rectangle(5,6));
        shapes.add(new Triangle(5,10,5,8,9));

        for (Shape shape : shapes) {
        System.out.println("Area of this shape : " + shape.area());
        System.out.println("perimeter of this shape : " + shape.perimeter());
        }
    }
}