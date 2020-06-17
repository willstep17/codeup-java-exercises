public class BubbleSort {
    public static void main(String[] args) {
        int[] toBeSorted = {3, 6, 7, 11, 24};
        int[] afterSort = bubbleSort(toBeSorted);
        printArray(afterSort);
    }

    private static int[] bubbleSort(int[] inputArray) {
        int n = inputArray.length;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(inputArray[j] > inputArray[j+1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                }
            }
        }
        return inputArray;
    }

    private static void printArray(int[] inputArray) {
        for(int i : inputArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
