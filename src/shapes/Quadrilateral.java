package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double inputLength, double inputWidth) {
        this.length = inputLength;
        this.width = inputWidth;
    }

    public abstract void setLength(double inputLength);

    public abstract void setWidth(double inputWidth);

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }
    
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    public double getArea() {
        return this.length * this.width;
    }
}
