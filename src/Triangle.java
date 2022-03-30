public class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle () {
        side1 = 2.0;
        side2 = 2.0;
        side3 = 2.0;
    }

    public Triangle (double side1, double side2, double side3, String color, boolean filled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(filled);
    }
}
