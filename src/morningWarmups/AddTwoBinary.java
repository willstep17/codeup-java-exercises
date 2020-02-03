package morningWarmups;

public class AddTwoBinary {
    public static void main(String[] args) {

        System.out.println(addTwoBinary(3, 5));

    }

    public static int[] addTwoBinary(long inputOne,long inputTwo) {
        int i = 0, carry = 0;
        int[] sum = new int[10];
        while (inputOne != 0 || inputTwo != 0) {
            sum[i++] = (int)((inputOne % 10 + inputTwo % 10 + carry) % 2);
            carry = (int)((inputOne % 10 + inputTwo % 10 + carry) % 2);
            inputOne = inputOne / 10;
            inputTwo = inputTwo / 10;
        }
        if (carry != 0) {
            sum[i++] = carry;
        }
        --i;
        return sum;
    }

    public static String binaryMath (String binary1, String binary2) {
        return Integer.toBinaryString(Integer.parseInt(binary1, 2) + Integer.parseInt(binary2, 2));
    }
}
