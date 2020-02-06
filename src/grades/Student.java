package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String inputName, ArrayList<Integer> inputGrades, HashMap<String, String> inputAttendance) {
        this.name = inputName;
        this.grades = inputGrades;
        this.attendance = inputAttendance;
    }

    public static void main(String[] args) {
        ArrayList<Integer> studentOneGrades = new ArrayList<>();
        studentOneGrades.add(98);
        studentOneGrades.add(85);
        studentOneGrades.add(92);
        HashMap<String, String> studentOneAttendance = new HashMap<String, String>();
        studentOneAttendance.put("2020-01-06", "Y");
        studentOneAttendance.put("2020-01-07", "N");
        studentOneAttendance.put("2020-01-08", "Y");
        studentOneAttendance.put("2020-01-09", "N");
        studentOneAttendance.put("2020-01-10", "Y");
        Student studentOne = new Student("Charles", studentOneGrades, studentOneAttendance);
        System.out.println("studentOne name: " + studentOne.getName());
        System.out.println("studentOne average: " + studentOne.getGradeAverage());
        studentOne.addGrade(78);
        System.out.println("studentOne average: " + studentOne.getGradeAverage());
        System.out.println("studentOne days absent: " + studentOne.getDaysAbsent());
        studentOne.recordAttendance("2020-01-13", "Y");
        studentOne.recordAttendance("2013", "Y");
        studentOne.recordAttendance("2020-01-13", "R");


    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public void displayAllGrades() {
        System.out.println("Potions: " + this.grades.get(0));
        System.out.println("DATDA: " + this.grades.get(1));
        System.out.println("Charms: " + this.grades.get(2));
        System.out.println("History of Magic: " + this.grades.get(3));
        System.out.println("");
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getGradeAverage() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void recordAttendance(String inputDate, String inputPresent) {
        if(!inputDate.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}")) {
            System.out.println("Invalid date. Please try again.");
            return;
        }
        if(!inputPresent.matches("[YN]")) {
            System.out.println("Invalid attendance input. Please try again.");
            return;
        }
        this.attendance.put(inputDate, inputPresent);
    }

    public double getAttendancePercentage() {
        int present = 0;
        int totalDays = 0;
        for(Map.Entry<String, String> entry : attendance.entrySet()) {
            if(entry.getValue().equals("Y")) {
                present++;
            }
            totalDays++;
        }
        return (double) (totalDays / present) * 100;
    }

    public String getDaysAbsent() {
        String returnString = "";
        for(Map.Entry<String, String> entry : attendance.entrySet()) {
            if(entry.getValue().equals("N")) {
                returnString += entry.getKey() + ", ";
            }
        }
        return returnString;
    }
}
