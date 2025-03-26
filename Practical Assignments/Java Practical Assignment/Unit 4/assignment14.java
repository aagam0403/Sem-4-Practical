import java.util.Scanner;
public class  
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        try 
        {
            System.out.print("Enter a number: ");
            int num = Integer.parseInt(scanner.nextLine());

            int result = 100 / num;
            System.out.println("Result: " + result);

            int[] arr = {10, 20, 30};
            System.out.print("Enter an array index: ");
            int index = scanner.nextInt();
            System.out.println("Array element: " + arr[index]);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Division by zero is not allowed.");
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Error: Invalid array index.");
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Error: Invalid number format. Please enter a valid integer.");
        } 
        catch (Exception e) 
        {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
