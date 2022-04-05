public class Shape {
    private String color;
    private boolean filled;

    public Shape () {
        color = "Red";
        filled = false;
    }

    public Shape (String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor () {
        return color;
    }

    public boolean getFilled () {
        return filled;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public void setFilled (boolean filled) {
        this.filled = filled;
    }

    public String toString () {
        return "Shape is " + color + " and filled is " + filled + ".";
    }

}
