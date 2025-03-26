import javax.swing.*;
import java.util.Arrays;

class EvenOddException extends Exception 
{
    public EvenOddException(String message) 
    {
        super(message);
    }
}
public class assignment4 
{
    public static int oddCount = 0;
    public static void checkEvenNumber(int number) throws EvenOddException {
        if (number % 2 != 0) 
        {
            oddCount++;
            throw new EvenOddException("Error!! Enter an even number");
        }
        else 
        {
            System.out.println("Valid even number: " + number);
        }
    }

    public static void main(String[] args) 
    {
        int[] numbers = new int[5];
        try 
        {
            for (int i = 0; i < 5; i++) 
            {
                String input = JOptionPane.showInputDialog("Enter number " + (i + 1) + ":");
                numbers[i] = Integer.parseInt(input);
                checkEvenNumber(numbers[i]);
            }
        } 
        catch (EvenOddException e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("Odd Count = "+oddCount);
    }
}
