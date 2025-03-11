class OddThread extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 10; i += 2) 
        {
            System.out.println("Odd: " + i);
            try 
            {
                Thread.sleep(500);
            } 
            catch (InterruptedException e) 
            {
                System.out.println("OddThread interrupted");
            }
        }
    }
}

class EvenThread implements Runnable 
{
    public void run() 
    {
        for (int i = 2; i <= 10; i += 2) 
        {
            System.out.println("Even: " + i);
            try 
            {
                Thread.sleep(500);
            } 
            catch (InterruptedException e) 
            {
                System.out.println("EvenThread interrupted");
            }
        }
    }
}

public class assignment8
{
    public static void main(String args[]) 
    {
        OddThread oddThread = new OddThread();
        Thread evenThread = new Thread(new EvenThread());

        oddThread.start();
        evenThread.start();
    }
}
