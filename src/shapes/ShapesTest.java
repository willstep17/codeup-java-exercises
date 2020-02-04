package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

        Rectangle square1 = new Square(3.3);
        System.out.println(square1.getPerimeter());
        System.out.println(square1.getArea());

    }
}
