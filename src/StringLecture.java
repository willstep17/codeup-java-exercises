public class StringLecture {
    public static void main(String[] args) {

//        String message = "Hello";
//        String s = "Hello"; //Hello and s are currently pointing to the same place in memory
//        System.out.println(message);
//        message = message + " World";
//        System.out.println(message);

//        String compare = "Hello Codeup";
//        String otherCompare = "hello Codeup";
//        boolean equals = compare.equals(otherCompare);
//        System.out.println(equals); //False
//        boolean otherEquals = compare.equalsIgnoreCase(otherCompare);
//        System.out.println(otherEquals);

        String hello = "Hi";
        System.out.println("Hi".startsWith("H"));


    }

    public static long sum(int inputNumber) {
        long sum = 0;
        for(int i=1;i<=inputNumber;i++) {
            sum += i;
        }
        return sum;
    }
}
