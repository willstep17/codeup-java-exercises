import java.util.Arrays;

public class ArrayLecture {
    public static void main(String[] args) {


        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printMatrix(matrix);


//        demo3();




    }

    public static void demo2() {
        String[] beatles = {"John", "Paul", "Ringo"};
        System.out.println(beatles[1]); //Paul
        System.out.println(beatles[2]); //Ringo
        System.out.println(beatles[0]); //John

        //Regular for loop
        for(int i=0;i<beatles.length;i++) {
            System.out.println(beatles[i]);
        }

        //Enhanced for loop
        for(String beetle : beatles) {
            System.out.println(beetle);
        }
    }

    public static void demo3() {
        int[] myInts = new int[5];
        Arrays.fill(myInts, -5);
        System.out.println(Arrays.toString(myInts));

        int[] intArr = {-5, -5, -5, -5, -5};
        int[] dummyArr = {0, 0, 0};
        System.out.println(Arrays.equals(myInts, intArr));
        System.out.println(Arrays.equals(intArr, dummyArr));


    }

    public static void printMatrix(int[][] inputMatrix) {
        for (int[] row : inputMatrix) {
            System.out.println("+--+--+--+--+");
            System.out.print("| ");
            for(int col : row) {
                System.out.print(col + " | ");
            }
            System.out.println();
        }
        System.out.println("+--+--+--+--+");
    }

}
