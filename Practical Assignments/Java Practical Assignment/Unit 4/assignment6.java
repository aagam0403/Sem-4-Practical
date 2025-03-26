import java.util.*;
class DivideClass
{
    float Divide(int a, int b)
    {
        return a/b;
    }
}
class assignment6
{
    public static void main(String[] args) 
    {
        DivideClass d = new DivideClass();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = s.nextInt();
        System.out.print("Enter B = ");
        int b = s.nextInt();
        try
        {
            System.out.println(d.Divide(a,b));
        }
        catch(Exception e)
        {
            System.out.println("Divide by 0 error");
        }
    }
}