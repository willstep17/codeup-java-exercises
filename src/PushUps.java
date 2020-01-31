public class PushUps {
    public static void main(String[] args) {
        System.out.println(multiplyWOmultiply(2, 4));
    }

    public static int multiplyWOmultiply(int a, int b) {
        int sum = 0;
        for(int i=0;i<b;i++) {
            sum += a;
        }
        return sum;
    }
}
