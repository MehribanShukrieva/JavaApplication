import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare variables to store two binary numbers, an index, and a remainder
        long binary1, binary2;
        int i = 0, remainder = 0;

        // Create an array to store the sum of binary digits
        int[] sum = new int[20];
        Scanner in = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        binary1 = in.nextLong();
        System.out.print("Input second binary number: ");
        binary2 = in.nextLong();

        while (binary1 != 0 || binary2 != 0)
        {
            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        // If there is a remaining carry, add it to the sum
        if (remainder != 0) {
            sum[i++] = remainder;
        }

        // Decrement the index to prepare for printing
        --i;

        // Display the sum
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }

        System.out.print("\n");
    }
}
