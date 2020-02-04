package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double inputLength, double inputWidth) {
        this.length = inputLength;
        this.width = inputWidth;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }
}
