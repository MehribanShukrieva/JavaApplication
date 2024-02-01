import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        count(test);
    }
    public static void count(String x) {
        char[] ch = x.toCharArray();

        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;

        // Iterate through the character array to categorize characters
        for (int i = 0; i < x.length(); i++) {
            // Check if the character is a letter or not
            if (Character.isLetter(ch[i])) {
                letter++;
            }
            // Check if the character is a digit (number) or not
            else if (Character.isDigit(ch[i])) {
                num++;
            }
            // Check if the character is a space
            else if (Character.isSpaceChar(ch[i])) {
                space++;
            }
            else {
                other++;
            }
        }
        System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");

        // Display the counts of letters, spaces, numbers, and other characters
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
    }
} 
