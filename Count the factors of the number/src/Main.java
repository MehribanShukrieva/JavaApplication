import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int x = in.nextInt();
        System.out.println(result(x));
    }
    public static int result(int num) {
        int ctr = 0;

        // Iterate from 1 to the square root of the input number
        for (int i = 1; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0 && i * i != num) {
                ctr += 2;
            } else if (i * i == num) {
                ctr++;  // If 'i' is a perfect square, increase the count by 1
            }
        }
        return ctr;
    }
}
