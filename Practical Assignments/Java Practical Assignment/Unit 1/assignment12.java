import java.util.*;
class assignment12
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = s.nextInt();
        System.out.print("Enter B = ");
        int b = s.nextInt();
        System.out.print("Enter C = ");
        int c = s.nextInt();
        if(a>b && a>c)
        {
            System.out.println("A is largest");
        }
        else if(b>a && b>c)
        {
            System.out.println("B is largest");
        }
        else
        {
            System.out.println("C is largest");
        }
    }
}