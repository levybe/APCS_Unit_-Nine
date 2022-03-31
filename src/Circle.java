public class Circle extends Shape {
    private double radius;

    public Circle () {
        super();
        radius = 10.0;
    }

    public Circle (String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius () {
        return radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    public double getArea () {

    }
}
