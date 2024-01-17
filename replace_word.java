import java.util.Scanner;

public class replace_word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        // Remove all occurrences of "the" (case insensitive)
        String modifiedLine = input.replaceAll("(?i)the", "");

        // Print the modified line
        System.out.println("Modified Line: " + modifiedLine);

        scanner.close();
        
    }
}