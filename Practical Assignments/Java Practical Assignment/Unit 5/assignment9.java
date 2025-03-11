class MyThread extends Thread 
{
    public MyThread(String name, int priority) 
    {
        super(name);
        setPriority(priority);
    }

    public void run() 
    {
        try 
        {
            for (int i = 1; i <= 5; i++) 
            {
                System.out.println(getName() + " is running with priority " + getPriority());
                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e) 
        {
            System.out.println(getName() + " interrupted");
        }
    }
}

public class assignment9 
{
    public static void main(String args[]) 
    {
        MyThread t1 = new MyThread("Thread 1", Thread.MIN_PRIORITY);
        MyThread t2 = new MyThread("Thread 2", Thread.NORM_PRIORITY);
        MyThread t3 = new MyThread("Thread 3", Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
