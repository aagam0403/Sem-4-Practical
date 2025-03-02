import java.util.*;
interface numbers
{
    int process();
}
class sum implements numbers
{
    int a,b;
    sum(int a,int b)
    {
        this.a=a;
        this.b=b;
    }

    @Override
    public int process() 
    {
        return a+b;
    }
}
class avge implements numbers
{
    int a,b;
    avge(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    
    @Override
    public int process() 
    {
        return (a+b)/2;
    }
}
class assignment5
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = s.nextInt();
        System.out.print("Enter B : ");
        int b = s.nextInt();
        sum su = new sum(a, b);
        System.out.println("Sum of 2 numbers is = "+su.process());
        avge av = new avge(a,b);
        System.out.println("Average of 2 numbers is = "+av.process());    
    }
}