import java.util.*;
class assignment14 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int num = s.nextInt();
        int reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;
        while(num != 0) {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num /= 10;
        }

        if (originalInteger == reversedInteger)
        {
            System.out.println(originalInteger + " is a Palindrome.");
        }
        else
        {
            System.out.println(originalInteger + " is not a Palindrome.");
        }
    }
}