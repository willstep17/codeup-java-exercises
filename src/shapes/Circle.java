package shapes;

public class Circle {
    private double radius;
    private static int numberOfCircles;
    private static double totalCircumference;
    private static double totalArea;

    public Circle(double inputRadius) {
        this.radius = inputRadius;
        numberOfCircles++;
        totalCircumference += this.getCircumference();
        totalArea += this.getArea();
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public static void circleStatistics() {
        System.out.println("\n<*<*<* Circle Statistics *>*>*>");
        System.out.println("Number of circles: " +  numberOfCircles);
        System.out.println("Total circumference of circles: " + totalCircumference);
        System.out.println("Total area of circles: " + totalArea);
    }
}
