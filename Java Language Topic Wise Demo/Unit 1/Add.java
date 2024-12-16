//Addition of two numbers
import java.util.Scanner;
class Add
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = s.nextInt();
        System.out.println("Enter the value of b : ");
        int b = s.nextInt();
        System.out.println("Addition of A & B = " +(a+b));
    }
}