package hackerRank;

import java.util.Scanner;

public class warmup1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        int multiplied = 0;
        for(int i=1;i<=10;i++) {
            multiplied = N * i;
            System.out.println(N + " x " + i + " = " + multiplied);
        }
    }
}
