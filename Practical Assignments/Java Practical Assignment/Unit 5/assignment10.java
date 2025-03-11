class SumThread extends Thread 
{
    private int start, end, sum;

    public SumThread(int start, int end) 
    {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    public void run() 
    {
        for (int i = start; i <= end; i++) 
        {
            sum += i;
        }
        System.out.println("Sum from " + start + " to " + end + " is: " + sum);
    }

    public int getSum() 
    {
        return sum;
    }
}

public class assignment10
{
    public static void main(String args[]) 
    {
        SumThread t1 = new SumThread(1, 5);
        SumThread t2 = new SumThread(6, 10);
        SumThread t3 = new SumThread(11, 15);

        t1.start();
        t2.start();
        t3.start();

        int totalSum = t1.getSum() + t2.getSum() + t3.getSum();
        double average = totalSum / 15.0;

        System.out.println("Total Sum: " + totalSum);
        System.out.println("Average: " + average);
    }
}
