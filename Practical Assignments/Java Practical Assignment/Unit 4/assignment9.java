class InvalidNumberException extends Exception 
{
    public InvalidNumberException(String message) 
    {
        super(message);
    }
}

class SquareCalculator 
{
    public static int calculateSquare(int number) throws InvalidNumberException 
    {
        return number * number;
    }
}

public class assignment9
{
    public static void main(String[] args) 
    {
        try 
        {
            int num = 5;
            int square = SquareCalculator.calculateSquare(num);
            System.out.println("Square: " + square);
        }
        catch (InvalidNumberException e) 
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}