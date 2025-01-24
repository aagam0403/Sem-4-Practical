import java.util.*;
class assignment1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> A = new ArrayList<Integer>();
        for(int i = 0;i<10;i++)
        {
            System.out.println(" enter the value : ");
            A.add(sc.nextInt());
        }
        System.out.println(" Array list is : " +A);
        int min_a = A.get(0);
        for(int i=0;i<A.size();i++)
        {
            if(min_a>A.get(i))
            {
                min_a=A.get(i);
            }
        }
        System.out.println(" minimum value is : " +min_a);
    }
}