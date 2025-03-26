import java.util.Scanner;

public class assignment17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuffer sb = new StringBuffer(input);

        System.out.println("\n--- StringBuffer Methods Demonstration ---");
        System.out.println("Original StringBuffer: " + sb);
        
        sb.append(" is awesome!");
        System.out.println("After append: " + sb);
        
        sb.insert(5, " (Java)");
        System.out.println("After insert: " + sb);
        
        sb.replace(5, 11, "[JAVA]");
        System.out.println("After replace: " + sb);
        
        sb.delete(5, 11);
        System.out.println("After delete: " + sb);
        
        sb.reverse();
        System.out.println("After reverse: " + sb);
        sb.reverse();

        System.out.println("Capacity of StringBuffer: " + sb.capacity());

        scanner.close();
    }
}
