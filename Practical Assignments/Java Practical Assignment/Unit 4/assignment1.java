import java.util.Scanner;
public class assignment1 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int sum = 0;

            if (number<=0)
            {
                System.out.println("Write Positive Number");
            }
            else
            {
                while (number > 0) {
                    sum += number % 10;
                    number /= 10;
                }
                System.out.println("Sum of digits: " + sum);
            }
        }
        catch (Exception e) 
        {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
    }
}