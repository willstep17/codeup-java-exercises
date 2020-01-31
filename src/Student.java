import java.util.Date;

public class Student {
    String name;
    String cohort;
    Date startDate;
    String program;
    boolean drinksCoffee;

    public static void main(String[] args) {
        Student daniel = new Student();
        daniel.name = "Daniel";

        Student zach = new Student();
        zach.name = "Zach";

        System.out.println(daniel.name);
        System.out.println(zach.name);
    }
}
