public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 17;
        System.out.println(myFavoriteNumber);
        String myString = "This is my String";
        System.out.println(myString);
        float myNumber = 3.14f;
        System.out.println(myNumber);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        String theNumberThree = "three";
        Object o = theNumberThree;
        System.out.println(o);

        int y = 4;
        y += 5;
        System.out.println(y);

        int z = 3;
        int a = 4;
        z += a;
        System.out.println(z);

        int b = 10;
        int c = 2;
        b /= c;
        c -= b;
        System.out.println(b);
        System.out.println(c);

        byte thisByte = 127;
        thisByte++; //Cycles over to -128
        System.out.println(thisByte); //-128

        int maxInt = Integer.MAX_VALUE;
        System.out.println("Maximum int: " + maxInt);

        long maxLong = Long.MAX_VALUE;
        System.out.println("Maximum long: " + maxLong);

        float maxFloat = Float.MAX_VALUE;
        System.out.println("Maximum float: " + maxFloat);

        double maxDouble = Double.MAX_VALUE;
        System.out.println("Maximum double: " + maxDouble);
    }
}
