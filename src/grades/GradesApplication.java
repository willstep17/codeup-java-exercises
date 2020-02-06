package grades;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
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
        HashMap<String, String> harryPotterAttendance = new HashMap<>();
        harryPotterAttendance.put("2020-01-06", "Y");
        harryPotterAttendance.put("2020-01-07", "N");
        harryPotterAttendance.put("2020-01-08", "Y");
        harryPotterAttendance.put("2020-01-09", "Y");
        harryPotterAttendance.put("2020-01-10", "Y");
        Student harryPotter = new Student("Harry Potter", harryPotterGrades, harryPotterAttendance);
        students.put("harryP0tter", harryPotter);

        ArrayList<Integer> ronWeasleyGrades = new ArrayList<>();
        ronWeasleyGrades.add(45);
        ronWeasleyGrades.add(78);
        ronWeasleyGrades.add(86);
        ronWeasleyGrades.add(89);
        HashMap<String, String> ronWeasleyAttendance = new HashMap<>();
        ronWeasleyAttendance.put("2020-01-06", "N");
        ronWeasleyAttendance.put("2020-01-07", "Y");
        ronWeasleyAttendance.put("2020-01-08", "Y");
        ronWeasleyAttendance.put("2020-01-09", "N");
        ronWeasleyAttendance.put("2020-01-10", "Y");
        Student ronWeasley = new Student("Ron Weasley", ronWeasleyGrades, ronWeasleyAttendance);
        students.put("RON@Griff", ronWeasley);

        ArrayList<Integer> hermioneGrangerGrades = new ArrayList<>();
        hermioneGrangerGrades.add(99);
        hermioneGrangerGrades.add(100);
        hermioneGrangerGrades.add(98);
        hermioneGrangerGrades.add(96);
        HashMap<String, String> hermioneGrangerAttendance = new HashMap<>();
        hermioneGrangerAttendance.put("2020-01-06", "Y");
        hermioneGrangerAttendance.put("2020-01-07", "Y");
        hermioneGrangerAttendance.put("2020-01-08", "Y");
        hermioneGrangerAttendance.put("2020-01-09", "Y");
        hermioneGrangerAttendance.put("2020-01-10", "Y");
        Student hermioneGranger = new Student("Hermione Granger", hermioneGrangerGrades, hermioneGrangerAttendance);
        students.put("granger100", hermioneGranger);

        ArrayList<Integer> dracoMalfoyGrades = new ArrayList<>();
        dracoMalfoyGrades.add(97);
        dracoMalfoyGrades.add(89);
        dracoMalfoyGrades.add(92);
        dracoMalfoyGrades.add(87);
        HashMap<String, String> dracoMalfoyAttendance = new HashMap<>();
        dracoMalfoyAttendance.put("2020-01-06", "Y");
        dracoMalfoyAttendance.put("2020-01-07", "Y");
        dracoMalfoyAttendance.put("2020-01-08", "Y");
        dracoMalfoyAttendance.put("2020-01-09", "Y");
        dracoMalfoyAttendance.put("2020-01-10", "N");
        Student dracoMalfoy = new Student("Draco Malfoy", dracoMalfoyGrades, dracoMalfoyAttendance);
        students.put("drrraculaM", dracoMalfoy);

        System.out.println("Welcome to the Hogwarts student database!");

        while(true) {
            System.out.println("\nWhich student would you like more information on?");
            System.out.println("GitHub Usernames: " + students.keySet());
            System.out.println("'A' for all students.");
            System.out.println("'R' for csv report on all students.");
            System.out.print("GitHub username: ");
            String inputKey = scanner.nextLine();
            if(inputKey.matches("[A]")) {
                displayAllGrades(students);
            } else if(inputKey.matches("[R]")) {
                csvReport(students);
            } else if(students.containsKey(inputKey)) {
                System.out.println("Student Name: " + students.get(inputKey).getName());
                System.out.println("Student Attendance: " + students.get(inputKey).getAttendancePercentage());
                System.out.println("Student Grade Average: " + students.get(inputKey).getGradeAverage());
                students.get(inputKey).displayAllGrades();
            } else {
                System.out.println("Username does not exist.");
            }
            System.out.print("Would you like to search for another student? (y/n): ");
            String toContinue = scanner.nextLine();
            if(toContinue.toLowerCase().equals("n")) {
                System.out.println("\nGoodbye.");
                return;
            }
        }
    }

    public static void displayAllGrades(HashMap<String, Student> inputStudents) {
        ArrayList<Integer> allGrades = new ArrayList<>();
        int sum = 0;
        for(Map.Entry<String, Student> entry : inputStudents.entrySet()) {
            Student student = entry.getValue();
            ArrayList<Integer> currentStudentGrades = student.getGrades();
            for(int grade : currentStudentGrades) {
                allGrades.add(grade);
                sum += grade;
            }
        }
        System.out.println("Overall Student Average: " + sum / allGrades.size());
        System.out.print("Individual Grades: ");
        for(int grade : allGrades) {
            System.out.print(grade + " ");
        }
        System.out.println("\n");
    }

    public static void csvReport(HashMap<String, Student> inputStudents) {
        for(Map.Entry<String, Student> entry : inputStudents.entrySet()) {
            Student student = entry.getValue();
            System.out.println(student.getName() + ", " + entry.getKey() + ", gradeAverage=" + student.getGradeAverage() + ", attendance=" + student.getAttendancePercentage());
        }
        System.out.println("");
    }
}
