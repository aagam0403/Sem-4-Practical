class MyRunnable implements Runnable 
{
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Thread running: " + i);
            try 
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) 
            {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class assignment3
{
    public static void main(String args[]) 
    {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
