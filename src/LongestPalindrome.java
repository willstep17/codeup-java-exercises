public class LongestPalindrome {
    static int resultStart;
    static int resultLength;

    public static void main(String[] args) {
        String test1 = "What is the longest palindrome here?";
        String test2 = "A racecar is fast.";
        String test3 = "Apple candy time swimming summer.";
        String test4 = "Madam, a madam";
        System.out.println(longestPalindrome(test1));
        System.out.println(longestPalindrome(test2));
        System.out.println(longestPalindrome(test3));
        System.out.println(longestPalindrome(test4));
    }

    public static String longestPalindrome(String s) {
        int strLength = s.length();
        if(s.length() < 2) {
            return s;
        }
        for(int start = 0;start < strLength - 1;start++) {
            expandRange(s, start, start);
            expandRange(s, start, start + 1);
        }
        return s.substring(resultStart, resultStart + resultLength);
    }

    private static void expandRange(String str, int begin, int end) {
        while(begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)) {
            begin--;
            end++;
        }
        if(resultLength < end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }
}
