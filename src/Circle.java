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
        return 3.14 * Math.pow(radius, 2);
    }

    public double getCircumference () {
        return 2 * 3.14 * radius;
    }

    public double getDiameter () {
        return 2 * radius;
    }

    public String toString () {
        return "The circle has a radius of " + radius + ". \n" + super.toString();
    }
}
