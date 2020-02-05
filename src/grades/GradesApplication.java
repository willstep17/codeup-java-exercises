package grades;

import java.util.HashMap;
import java.util.ArrayList;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        ArrayList<Integer> harryPotterGrades = new ArrayList<>();
        harryPotterGrades.add(78);
        harryPotterGrades.add(98);
        harryPotterGrades.add(88);
        students.put("harryP0tter", harryPotterGrades);

    }
}
