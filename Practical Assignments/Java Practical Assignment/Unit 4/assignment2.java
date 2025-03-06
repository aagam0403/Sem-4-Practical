import java.util.*;
class LengthMatchException extends Exception
{
    public LengthMatchException(String message)
    {
        super(message);
    }
}
public class assignment2
{
    public static void CheckStringLength(String str, int exceptionLength) throws LengthMatchException
    {
        if (str.length()!=exceptionLength)
        {
            throw new LengthMatchException("Error, Expected Length is not matches");
        }
        else
        {
            System.out.println("String Length Matches");
        }
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        try
        {
            System.out.print("Enter a String : ");
            String inputString = s.nextLine();

            System.out.print("Enter Expected Length : ");
            int exceptionLength = s.nextInt();

            CheckStringLength(inputString, exceptionLength);
        }
        catch (LengthMatchException e)
        {
            System.out.println(e.getMessage());
        }
    }
}