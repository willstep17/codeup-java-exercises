package hackerRank;

public class SpecialStringAgain {

    public static void main(String[] args) {
        int[] test = {3, 4, 5, 1, 2};
        printArray(test);
        swap(3, 2, test);
        printArray(test);
        int[] sortedArr = sort(test);
        printArray(sortedArr);
    }

    private static int[] sort(int[] inputArr) {
        for(int i=0;i<inputArr.length - 1;i++) {
            for(int j=0;j<inputArr.length - i - 1;j++) {
                if(inputArr[j] > inputArr[j+1]) {
                    int temp = inputArr[j];
                    inputArr[j] = inputArr[j+1];
                    inputArr[j+1] = temp;
                }
            }
        }
        return inputArr;
    }

    private static void swap(int a, int b, int[] inputArr) {
        int temp = inputArr[b];
        inputArr[b] = inputArr[a];
        inputArr[a] = temp;
    }

    private static void printArray(int[] inputArr) {
        for(int i : inputArr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

}