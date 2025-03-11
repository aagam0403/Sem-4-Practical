import java.util.*;
class OddNo extends Thread
{
    public void run()
    {
        for(int i=0;i<=50;i++)
        {
            if(i%2!=0)
            {
                System.out.println("Odd No. = "+i);
            }
        }
    }
}
class EvenNo extends Thread
{
    public void run()
    {
        for(int j=0;j<51;j++)
        {
            if(j%2==0)
            {
                System.out.println("Even No. = "+j);
            }
        }
    }
}
public class assignment2
{
    public static void main(String args[]) 
    {
        OddNo o = new OddNo();
        EvenNo e = new EvenNo();
        e.start();
        o.start();
    }   
}