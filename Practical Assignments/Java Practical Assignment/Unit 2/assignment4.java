import java.util.*;
import java.util.Collections;
public class assignment4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<Integer>();
        System.out.println(" enter how many elements you want :");
        int n = sc.nextInt();
        System.out.println(" enter "+n+" elemets : ");
        for(int i=0;i<n;i++)
        {
            A.add(sc.nextInt());
        }
        System.out.println(" the Array list is : " +A);
        Collections.sort(A);
        System.out.println(" after sorting Arraylist is : " +A);
    }
}