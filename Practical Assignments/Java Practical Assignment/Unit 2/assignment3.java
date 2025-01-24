import java.util.*;
public class assignment3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> A = new ArrayList<Integer>();
        System.out.println(" enter how many elemets you want : ");
        int n = sc.nextInt();
        System.out.println(" Enter " +n+ " elements : ");
        for(int i=0;i<n;i++)
        {
            A.add(sc.nextInt());
        }
        System.out.println(" the array list is : " +A);
        System.out.println(" the length of the array list is : " +A.size());
        for(int i=0;i<A.size();i++)
        {
            for(int j=i+1;j<A.size();j++)
            {
                if(A.get(i) == A.get(j))
                {
                    A.remove(j);
                    j--;
                }
            }
        }
        System.out.println(" after remove duplicate the arraylist is : " +A);
        System.out.println(" length of arraylist is : " +A.size());
    }
}