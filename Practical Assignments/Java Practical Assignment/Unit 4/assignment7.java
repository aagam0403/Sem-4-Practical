public class assignment7 
{
    public static void main(String[] args) 
    {
        int[] numbers = {1, 2, 3, 4, 5};    
        try 
        {
            System.out.println("Accessing index 10: " + numbers[10]);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Error: Attempted to access an index outside the array bounds.");
        }
    }
}