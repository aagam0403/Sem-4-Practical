import java.util.*;
import java.util.Collections;
public class assignement8 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println(" enter value for "+(i+1)+" element : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print("\t" +arr[i]);
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println(" after sorting array is : ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}