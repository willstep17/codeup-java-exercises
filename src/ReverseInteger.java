public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverseInt(2435));
        System.out.println(reverseInt(34335343));
        System.out.println(reverseInt(-32));
        System.out.println(reverseInt(1413313999)); //Within int bounds normally, out of bounds reversed
    }

    private static int reverseInt(int inputInt) {
        /* Hold onto the reversed number as a long because reversing an int could result in the value
        being greater than the inputInt. Exe: 123 < 321 */
        long reversed = 0;
        while(inputInt != 0) {
            reversed = reversed * 10 + inputInt % 10;
            inputInt /= 10;
        }
        if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reversed;
    }
}
