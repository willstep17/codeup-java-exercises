import java.util.Scanner;

public class ControlLoopExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Please enter 'y' to continue: ");
//        String userInput = scanner.nextLine();
//        //.equals to compare Strings
//        boolean confirmation = (userInput.equals("y"));
//        if(confirmation) {
//            System.out.println("Confirmed");
//        } else {
//            System.out.println("Denied");
//        }

//        boolean someCondition = true;
//        boolean anotherCondition = false;
//
//        if(someCondition) {
//            System.out.println("someCondition is true.");
//        } else {
//            System.out.println("someCondition is false");
//        }

//        int caseSwitch = 1;
//
//        switch(caseSwitch) {
//            case 1:
//                System.out.println("First condition.");
//                break;
//            case 2:
//                System.out.println("Second condition");
//                break;
//            default:
//                System.out.println("Default condition");
//                break;
//        }

//        int i = 0;
//        while (i < 4) {
//            System.out.println(i);
//            i++;
//        }

//        int j = 0;
//        do {
//            System.out.println(j);
//        } while (j != 0);

//        for (int t=0;t<7;t++) {
//            if(t == 3) {
//                continue; //Skip 3
//            } else if (t == 6) {
//                break; //Break before printing 6
//            }
//            System.out.println(t);
//        }

        for (int t=0;t<100;t++) {
            if(t % 2 == 1) {
                continue;
            }
            System.out.println(t);
        }

    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
