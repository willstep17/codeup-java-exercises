package shapes;

public class Square extends Rectangle {
    private double side;

    public Square(double inputSide) {
        super(inputSide, inputSide);
        this.side = inputSide;
    }

    public double getArea() {
        return 4 * side;
    }

    public double getPerimeter() {
        return Math.pow(side, 2);
    }
}
