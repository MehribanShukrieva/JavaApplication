import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long binaryNumber, decimalNumber = 0, j = 1, remainder;
        System.out.print("Input a binary number: ");
        binaryNumber = sc.nextLong();

        // Convert the binary number to decimal
        while (binaryNumber != 0) {
            remainder = binaryNumber % 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }

        // Display the decimal representation of the binary number
        System.out.println("Decimal Number: " + decimalNumber);
    }
}
