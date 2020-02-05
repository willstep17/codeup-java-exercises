package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String inputName, ArrayList<Integer> inputGrades) {
        this.name = inputName;
        this.grades = inputGrades;
    }

    public static void main(String[] args) {
        ArrayList<Integer> studentOneGrades = new ArrayList<>();
        studentOneGrades.add(98);
        studentOneGrades.add(85);
        studentOneGrades.add(92);
        Student studentOne = new Student("Charles", studentOneGrades);
        System.out.println("studentOne name: " + studentOne.getName());
        System.out.println("studentOne average: " + studentOne.getGradeAverage());
        studentOne.addGrade(78);
        System.out.println("studentOne average: " + studentOne.getGradeAverage());


    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
