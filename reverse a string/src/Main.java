import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");

        // Read the input string and convert it to a character array
        char[] letters = scanner.nextLine().toCharArray();
        System.out.print("Reverse string: ");

        // Iterate through the character array in reverse order and print each character
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");
    }
}
