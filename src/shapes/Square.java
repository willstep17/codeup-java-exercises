package shapes;

public class Square extends Rectangle {
    public Square(double inputSide) {
        super(inputSide, inputSide);
    }

    public double getArea() {
        return 4 * this.length;
    }

    public double getPerimeter() {
        return Math.pow(this.length, 2);
    }
}
