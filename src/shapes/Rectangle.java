package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double inputLength, double inputWidth) {
        super(inputLength, inputWidth);
    }

    @Override
    public void setLength(double inputLength) {
        this.length = inputLength;
    }

    @Override
    public void setWidth(double inputWidth) {
        this.width = inputWidth;
    }

}
