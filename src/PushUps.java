public class PushUps {
    public static void main(String[] args) {
        System.out.println(multiplyWOmultiply(2, 4));

        Student james = new Student("James");
        james.program = "Data Science";
        james.report();
        Car tesla = new Car("Tesla", "Model S", 2019);
        System.out.println(tesla.startYourEngine("Correct"));
        System.out.println(tesla.drive());
        System.out.println(tesla.mileage);

        for(int i=0;i<5000;i+=100) {
            System.out.println(tesla.drive());
        }

        System.out.println(tesla.mileage);

    }

    public static int multiplyWOmultiply(int a, int b) {
        int sum = 0;
        for(int i=0;i<b;i++) {
            sum += a;
        }
        return sum;
    }
}
