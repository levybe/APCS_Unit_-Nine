import java.util.ArrayList;

public class ShapeInheritance {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);
        System.out.println("The area of the circle is " + shapes.get(0).getArea() + ".");
        System.out.println("The area of the rectangle is " + shapes.get(1).getArea() + ".");
        System.out.println("The area of the triangle is " + shapes.get(2).getArea() + ".");
    }
}