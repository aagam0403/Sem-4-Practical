import java.util.*;
public class assignment3
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        try
        {
            System.out.print("Enter the n for Values : ");
            int size=s.nextInt();
            
            if (size < 2) 
            {
                throw new IllegalArgumentException("At least two numbers are required.");
            }

            int numbers[] = new int[size];
            for(int i=0;i<size;i++)
            {
                System.out.print("Enter Numbers : ");
                numbers[i] = s.nextInt();
            }
            System.out.println(" ");
            System.out.println("Last Number = "+numbers[size-1]);
            System.out.println("Second Last Number = "+numbers[size-2]);
        }
        catch(IllegalArgumentException e1)
        {
            System.out.println(e1.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Input Invalid!! Enter int Only");
        }
    }
}