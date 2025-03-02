import java.util.Scanner;
class Arith 
{
    int[] arr;
    int n;

    void mean() 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = s.nextInt();
        arr = new int[n];

        System.out.println("Enter the elements:");
        int sum = 0;
        for (int i = 0; i < n; i++) 
        {
            arr[i] = s.nextInt();
            sum += arr[i];
        }
        
        double meanValue = (double) sum / n;
        System.out.println("Arithmetic Mean: " + meanValue);
    }
}

class Stand extends Arith 
{
    void deviation() 
    {
        double meanValue = 0;
        for (int num : arr) 
        {
            meanValue += num;
        }
        meanValue /= n;

        double sumSquaredDiff = 0;
        for (int num : arr) 
        {
            sumSquaredDiff += Math.pow(num - meanValue, 2);
        }
        double standardDeviation = Math.sqrt(sumSquaredDiff / n);
        System.out.println("Standard Deviation: " + standardDeviation);
    }
}

public class assignment3 
{
    public static void main(String[] args) 
    {
        Stand o= new Stand();
        o.mean();      
        o.deviation(); 
    }
}