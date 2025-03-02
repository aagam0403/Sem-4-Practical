public class ThreadSleepDemo {
    public static void main(String[] args) 
    {
        System.out.println("Program started...");
        try 
        {
            Thread.sleep(3000);
        } 
        catch (InterruptedException e)
        {
            System.out.println("Sleep was interrupted!");
        }
        System.out.println("3 seconds have passed!");
    }
}
