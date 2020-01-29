public class StringLecture {
    public static void main(String[] args) {
        String message = "Hello";
        String s = "Hello"; //Hello and s are currently pointing to the same place in memory
        System.out.println(message);
        message = message + " World";
        System.out.println(message);
    }

    public static long sum(int inputNumber) {
        long sum = 0;
        for(int i=1;i<=inputNumber;i++) {
            sum += i;
        }
        return sum;
    }
}
