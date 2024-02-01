import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        // Read and store the first number
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        // Read and store the second number
        int num2 = in.nextInt();
        //print the sum of the two numbers
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        //print the difference of the two numbers
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        //print the product of the two numbers
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));

        //print the division of the two numbers
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

        //print the remainder of the division of the two numbers
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
    }
} 
