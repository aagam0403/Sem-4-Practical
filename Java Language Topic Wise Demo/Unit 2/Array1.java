import java.util.*;
class Array1
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int ar[] = new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Value"+(i+1)+":");
            ar[i] = s.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(ar[i]);
        }    
    }
}