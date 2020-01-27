public class LectureNotes {
    public static void main(String[] args) {
        //Primitive Data Types
        int num = 7;
        int num2 = 200;
        short short1 = 4500;
        byte byte1 = 117;
        long long1 = 400000000;
        long numtolong = num2;

        float float1 = 3.333f;
        double double1 = 4.634;

        boolean firstBoolean = false;

        char firstChar = 'A';
        char letterChar = '1';

        System.out.println(byte1);
        System.out.println(firstChar);

        //Reference data types String, Class, etc
        String firstString = "This is my first string";
        System.out.println(firstString.length());

        //Variable conventions are camel case
        //Variable conventions for final constants is ALL_CAPS_WITH_UNDERSCORES
        final double PI = 3.141592;
        final int SIDES_OF_A_DICE = 6;

        num--; //Evaluates to 7 THEN Decrements
        ++num; //Increments from 6 to 7 before evaluating as 7
        num++; //Evaluates as 7 THEN increments to 8
        System.out.println(num); //8

        double piTwo = 3.1415;
        int almostPi = (int) piTwo; //Casts piTwo as an int, but loses data
        System.out.println(almostPi); //3


    }
}
