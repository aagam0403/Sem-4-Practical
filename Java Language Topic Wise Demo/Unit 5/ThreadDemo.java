//Threading
import java.util.*;
class WelcomeMessage extends Thread
{
    public void run()
    {
        System.out.println(" Welcome to thread");
    }
}
public class ThreadDemo
{
    public static void main(String args[]) 
    {
        WelcomeMessage w = new WelcomeMessage();
        w.start();
    }   
}