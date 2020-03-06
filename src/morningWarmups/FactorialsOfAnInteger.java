package morningWarmups;

import java.util.ArrayList;

public class FactorialsOfAnInteger {
    public static void main(String[] args) {
        ArrayList<Integer> testList = factorialOfInteger(6);
        for(int i : testList) {
            System.out.println(i);
        }

    }

    public static ArrayList<Integer> factorialOfInteger(int inputInt) {
        ArrayList<Integer> factors = new ArrayList<>();
        for(int i=1;i<=inputInt;i++) {
            if(inputInt % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }
}
