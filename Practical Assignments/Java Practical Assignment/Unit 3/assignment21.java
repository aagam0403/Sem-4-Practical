import java.util.Scanner;
public class assignment21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        System.out.println("Strings are equal: " + str1.equals(str2));
        System.out.println("Strings are equal (ignoring case): " + str1.equalsIgnoreCase(str2));
        System.out.println("String comparison result: " + str1.compareTo(str2));
    }
}
