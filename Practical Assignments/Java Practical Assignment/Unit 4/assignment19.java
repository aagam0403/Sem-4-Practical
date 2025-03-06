import java.util.Scanner;
public class assignment19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        StringBuffer sb = new StringBuffer(inputString);
        sb.reverse();
        System.out.println("Reversed String: " + sb);
        
        System.out.print("Enter another string to append: ");
        String appendString = scanner.nextLine();
        sb.reverse().append(appendString);
        System.out.println("Modified String: " + sb);
        
        System.out.println("Capacity of StringBuffer: " + sb.capacity());
    }
}