package shapes;

public class Square extends Quadrilateral {

    public Square(double inputSide) {
        super(inputSide, inputSide);
    }

    @Override
    public void setLength(double inputLength) {
        this.length = inputLength;
        this.width = inputLength;
    }

    @Override
    public void setWidth(double inputWidth) {
        this.width = inputWidth;
        this.length = inputWidth;
    }

}
