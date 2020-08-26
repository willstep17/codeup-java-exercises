public class ReverseString {
    public static void main(String[] args) {
        String toBeReversed = "Reverse this string!";
        System.out.println(reverseWithStringBuilder(toBeReversed));
        System.out.println(reverseManually((toBeReversed)));
    }

    private static String reverseWithStringBuilder(String inputStr) {
        return new StringBuilder(inputStr).reverse().toString();
    }

    private static String reverseManually(String inputStr) {
        StringBuilder sb = new StringBuilder();
        for(int i=inputStr.length() - 1;i>=0;i--) {
            sb.append(inputStr.charAt(i));
        }
        return sb.toString();
    }
}
