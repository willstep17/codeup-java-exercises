public class ReverseInteger {
    public static void main(String[] args) {

    }

    private static int reverseInt(int inputInt) {
        /* Hold onto the reversed number as a long because reversing an int could result in the value
        being greater than the inputInt. Exe: 123 < 321 */
        long reversed = 0;
        while(inputInt != 0) {
            reversed = reversed * 10 + inputInt % 10;
            inputInt /= 10;
        }
    }
}
