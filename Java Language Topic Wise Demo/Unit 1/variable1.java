import java.util.*;
class variable1
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner (System.in);
        System.out.print("Enter Name: ");
        String name = s.next();
        System.out.print("Enter a Float Number: ");
        float f = s.nextFloat();
        System.out.print("Enter a Double Number: ");
        double d = s.nextDouble();
        System.out.println("\n--- Output ---");
        System.out.println("Name = " + name);
        System.out.println("Float Number = " + f);
        System.out.println("Double Number = " + d);
    }
}