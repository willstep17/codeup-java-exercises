import java.util.HashMap;
import java.util.Map;

//Create a method that returns the indexes of integers in an array that sum to target.
public class TwoSum {
    public static void main(String[] args) {
        int[] sampleArray = new int[] {2, 3, 7, 4, 8};
        int target = 7;
        int[] result = getTwoSum(sampleArray, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] getTwoSum(int[] numbers, int target) {
        Map<Integer, Integer> encounteredNumbersWithIndex = new HashMap();
        for(int i=0;i<numbers.length;i++) {
            int delta = target - numbers[i];
            if (encounteredNumbersWithIndex.containsKey(delta)) {
                return new int[] {i, encounteredNumbersWithIndex.get(delta)};
            }
            encounteredNumbersWithIndex.put(numbers[i], i);
        }
        return new int[] {-1, -1};
    }


}
