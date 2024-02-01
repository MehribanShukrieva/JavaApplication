public class Main {
    // Define a constant
    private static final double radius = 7.5;

    public static void main(String[] args) {
        // Calculate the perimeter of the circle;
        double perimeter = 2 * Math.PI * radius;

        // Calculate the area of the circle;
        double area = Math.PI * radius * radius;

        // Print them;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
