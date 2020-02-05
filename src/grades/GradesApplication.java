package grades;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();

        ArrayList<Integer> harryPotterGrades = new ArrayList<>();
        harryPotterGrades.add(78);
        harryPotterGrades.add(98);
        harryPotterGrades.add(88);
        harryPotterGrades.add(90);
        Student harryPotter = new Student("Harry Potter", harryPotterGrades);
        students.put("harryP0tter", harryPotter);

        ArrayList<Integer> ronWeasleyGrades = new ArrayList<>();
        ronWeasleyGrades.add(45);
        ronWeasleyGrades.add(78);
        ronWeasleyGrades.add(86);
        ronWeasleyGrades.add(89);
        Student ronWeasley = new Student("Ron Weasley", ronWeasleyGrades);
        students.put("RON@Griff", ronWeasley);

        ArrayList<Integer> hermioneGrangerGrades = new ArrayList<>();
        hermioneGrangerGrades.add(99);
        hermioneGrangerGrades.add(100);
        hermioneGrangerGrades.add(98);
        hermioneGrangerGrades.add(96);
        Student hermioneGranger = new Student("Hermione Granger", hermioneGrangerGrades);
        students.put("granger100", hermioneGranger);

        ArrayList<Integer> dracoMalfoyGrades = new ArrayList<>();
        dracoMalfoyGrades.add(97);
        dracoMalfoyGrades.add(89);
        dracoMalfoyGrades.add(92);
        dracoMalfoyGrades.add(87);
        Student dracoMalfoy = new Student("Draco Malfoy", dracoMalfoyGrades);
        students.put("drrraculaM", dracoMalfoy);

        System.out.println("Welcome to the Hoggwarts student database!");
        System.out.println("Here are the GitHub usernames of our students:\n");
        System.out.println(students.keySet());

        while(true) {
            System.out.println("\nWhich student would you like more information on?");
            System.out.print("GitHub username: ");
            String inputKey = scanner.nextLine();
            if(students.containsKey(inputKey)) {
                System.out.println("Student Name: " + students.get(inputKey).getName());
                System.out.println("Student Grade Average: " + students.get(inputKey).getGradeAverage());
            } else {
                System.out.println("Username does not exist.");
            }
            System.out.print("Would you like to search for another student (y/n)?: ");
            String toContinue = scanner.nextLine();
            if(toContinue.toLowerCase().equals("n")) {
                System.out.println("\nGoodbye.");
                return;
            }
        }

    }
}
