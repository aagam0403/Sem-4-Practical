import java.util.Scanner;
class CustomException extends Exception 
{
    public CustomException(String message) 
    {
        super(message);
    }
}
public class assignment15 
{
    public static void validateAge(int age) throws CustomException {
        if (age < 18)
        {
            throw new CustomException("Age must be 18 or above.");
        }
        else
        {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        try
        {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            validateAge(age);
        }
        catch (CustomException e) 
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
