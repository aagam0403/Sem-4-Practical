 import java.util.*;
 public class assignment9 {
    public static int searchArray(int Array[],int element)
        {
            for(int i=0;i<Array.length;i++)
            {
                if(Array[i]==element)
                {
                    System.out.print(" the element is availible in array : " +Array[i]+ " at index "+(i+1));
                    return i;
                }
            }
            System.out.println(" element not found in array sorry!");
            return -1;
        }
    public static void main(String ars[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter how many elements you want : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println(" enter the "+(i+1)+" element : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print("\t" +arr[i]);
        }
        System.out.println();
        System.out.println(" enter the element to search : ");
        int element = sc.nextInt();
        int result = searchArray(arr,element);
    }
}
