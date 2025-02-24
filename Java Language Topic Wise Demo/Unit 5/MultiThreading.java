//Multii Threading
import java.util.*;
class WelcomeMessage extends Thread
{
    int i;
    WelcomeMessage(int a)
    {
        i=a;
    }
    public void run()
    {
        System.out.println(" Welcome to thread " +i);
    }
}
public class MultiThreading
{
    public static void main(String args[]) 
    {
        WelcomeMessage w1 = new WelcomeMessage(1);
        WelcomeMessage w2 = new WelcomeMessage(2);
        WelcomeMessage w3 = new WelcomeMessage(3);
        WelcomeMessage w4 = new WelcomeMessage(4);
        
        w1.start();
        w2.start();
        w3.start();
        w4.start();
    }   
}