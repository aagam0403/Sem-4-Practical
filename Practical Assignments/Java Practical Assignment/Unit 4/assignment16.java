import java.util.Scanner;
public class assignment16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("\n--- String Methods Demonstration ---");
        System.out.println("Original String: " + str);
        System.out.println("Length of String: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("First Character: " + str.charAt(0));
        System.out.println("Last Character: " + str.charAt(str.length() - 1));
        System.out.println("Substring (first 3 chars): " + str.substring(0, Math.min(3, str.length())));
        System.out.println("Replaced 'a' with '@': " + str.replace('a', '@'));
        System.out.println("Trimmed String: '" + str.trim() + "'");
        System.out.println("Is empty: " + str.isEmpty());

        // Checking if string contains a specific word
        System.out.print("\nEnter a word to check if it exists in the string: ");
        String word = scanner.nextLine();
        System.out.println("Contains '" + word + "': " + str.contains(word));

        // Comparing two strings
        System.out.print("\nEnter another string to compare: ");
        String anotherStr = scanner.nextLine();
        System.out.println("Equals (case-sensitive): " + str.equals(anotherStr));
    }
}
