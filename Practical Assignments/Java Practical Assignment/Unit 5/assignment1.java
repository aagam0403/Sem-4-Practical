import java.util.*;
class Thread1 extends Thread 
{
    public void run() 
    {
        try 
        {
            while (true) 
            {
                System.out.println("I am Thread 1");
                Thread.sleep(2000);
            }
        } 
        catch (InterruptedException e) 
        {
            System.out.println("Thread1 interrupted");
        }
    }
}

class Thread2 extends Thread 
{
    public void run() 
    {
        try 
        {
            while (true) 
            {
                System.out.println("I am Thread 2");
                Thread.sleep(4000);
            }
        } 
        catch (InterruptedException e) 
        {
            System.out.println("Thread2 interrupted");
        }
    }
}

public class assignment1 
{
    public static void main(String args[]) 
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}