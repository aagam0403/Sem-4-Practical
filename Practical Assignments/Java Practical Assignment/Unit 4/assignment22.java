import java.util.Scanner;
public class Assignment22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        StringBuffer str = new StringBuffer(scanner.nextLine());
        
        System.out.println("Reversed String: " + str.reverse());
        
        System.out.print("Enter the string to be replaced: ");
        String oldStr = scanner.nextLine();
        System.out.print("Enter the new string: ");
        String newStr = scanner.nextLine();
        String replacedString = str.toString().replace(oldStr, newStr);
        System.out.println("String after replacement: " + replacedString);
        
        String upperCaseString = str.toString().toUpperCase();
        System.out.println("Uppercase String: " + upperCaseString);
        
        String lowerCaseString = upperCaseString.toLowerCase();
        System.out.println("Lowercase String: " + lowerCaseString);
    }
}