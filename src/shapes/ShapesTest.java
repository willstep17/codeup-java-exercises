package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable[] squares = new Measurable[3];

        Measurable myShape = new Square(5.7);
        System.out.println("Area of myShape: " + myShape.getArea());
        System.out.println("Perimeter of myShape: " + myShape.getPerimeter());

        //We have abstracted away the .getLength() method by declaring myShape as a Measurable
        //System.out.println("Length: " + myShape.getLength());

        Measurable myOtherShape = new Rectangle(2, 10);
        System.out.println("Area of myOtherShape: " + myOtherShape.getArea());
        System.out.println("Parimeter of myOtherShape: " + myOtherShape.getPerimeter());

        Quadrilateral myQuad = new Square(2.54);
        //Here .getLength is available because myQuad is a Quadrilateral
        System.out.println("Length of Quadrilateral myQuad : " + myQuad.getLength());
        System.out.println("Area of myQuad: " + myQuad.getArea());

    }
}
