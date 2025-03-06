public class assignment8 
{
    public static void main(String[] args) 
    {
        try 
        {
            int result = 12/0;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally
        {
            System.out.println("This message is printed from the finally block.");
        }
    }
}