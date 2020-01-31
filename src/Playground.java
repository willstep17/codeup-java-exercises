import shapes.Circle;
import util.Input;

public class Playground {
    public static void main(String[] args) {
//        String test = "Start";
//        test += 21;
//        System.out.println(test);

//        Person newPerson = new Person("Jim", 43);
//        newPerson.getName();

        Input input = new Input();
        Circle circle = new Circle(input.getDouble("Enter a radius: "));
        System.out.println(circle.getArea());

    }
}
