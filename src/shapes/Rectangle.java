package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double inputLength, double inputWidth) {
        this.length = inputLength;
        this.width = inputWidth;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }
}
