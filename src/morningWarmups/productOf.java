package morningWarmups;

import java.util.ArrayList;

public class productOf {
    public static void main(String[] args) {
        ArrayList<Integer> testArr = new ArrayList<Integer>();
        testArr.add(1);
        testArr.add(2);
        testArr.add(3);
        ArrayList<Integer> returnArr = productOf(testArr);
        for(int i=0;i<3;i++) {
            System.out.println(returnArr.get(i));
        }
    }

    public static ArrayList<Integer> productOf(ArrayList<Integer> inputArr) {
        int totalMultiplied = 1;
        for(int i=0;i<inputArr.size();i++) {
            totalMultiplied *= inputArr.get(i);
        }
        ArrayList<Integer> returnArr = new ArrayList<>();
        for(int j=0;j<inputArr.size();j++) {
            returnArr.add(totalMultiplied / inputArr.get(j));
        }
        return returnArr;
    }
}
