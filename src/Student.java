import java.util.Date;
import java.util.ArrayList;

public class Student {
    static int numberOfStudents = 0; //Belongs to class, not an instance of the class
    public String name; //Anyone who has access to the Student class can access the name property
    private String cohort;
    Date startDate;
    String program;
    String location;
    boolean drinksCoffee;

    public Student() {
        numberOfStudents++;
    }

    public Student(String inputName) {
        numberOfStudents++;
        this.name = inputName;
    }

    public Student(String inputName, String inputCohort) {
        numberOfStudents++;
        this.name = inputName;
        this.cohort = inputCohort;
    }

    public static void main(String[] args) {
        Student daniel = new Student("Daniel");
        daniel.cohort = "Europa";
        daniel.startDate = new Date("06/11/2018");
        daniel.program = "Web Development";
        daniel.location = "San Antonio";
        daniel.drinksCoffee = true;

        Student zach = new Student("Zach");
        zach.cohort = "Bayes";
        zach.startDate = new Date("February 11, 2017");
        zach.program = "Data Science";
        zach.location = "San Antonio";
        zach.drinksCoffee = false;

        Student ryan = new Student();

        System.out.println(daniel.report());
        System.out.println(zach.report());
        System.out.println(reportOnAllStudents());

    }

    public String report() {
        String output = "";
        output += "My name is " + this.name + ".\n";
        output += "I started learning " + this.program + " with " + this.cohort + " on " + this.startDate + ".\n";
        if(this.drinksCoffee) {
            output += "I drink coffee in " + this.location + ".\n";
        } else {
            output += "I don't drink coffee in " + this.location + ".\n";
        }
        return output;
    }

    public static String reportOnAllStudents() {
        return "There are " + numberOfStudents + " students at Codeup.";
    }
}
