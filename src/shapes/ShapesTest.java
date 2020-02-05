package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        Measurable myOtherShape = new Rectangle(2, 10);
        System.out.println(myOtherShape.getArea());
        System.out.println(myOtherShape.getPerimeter());

    }
}
