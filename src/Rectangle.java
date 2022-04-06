public class Rectangle extends Shape {
    private double width, height;

    public Rectangle () {
        super();
        width = 10.0;
        height = 5.0;
    }

    public Rectangle (String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth () {
        return width;
    }

    public double getHeight () {
        return height;
    }

    public void setWidth (double width) {
        this.width = width;
    }

    public void setHeight (double height) {
        this.height = height;
    }

    public double getArea () {
        return width * height;
    }

    public double getPerimeter () {
        return (width * 2) + (height * 2);
    }

    public String toString () {
        return "The rectangle has a width of" + width + " and a height of " + height + ". \n" + super.toString();
    }
}
