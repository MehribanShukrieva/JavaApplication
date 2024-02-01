import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = in.nextLine();

        // Convert the string to lowercase
        line = line.toLowerCase();

        // Print
        System.out.println(line);
    }
}
