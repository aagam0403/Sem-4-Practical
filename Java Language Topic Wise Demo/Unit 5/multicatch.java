//wap that perform create 5 size array, ask user to enter index
//handle array indexoutofboundexception
//handle arithmetic exception if user tries to divide by 0
//create string and initialize to null
//try printing its length and handle null pointerexception
import java.util.*;
class multicatch
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the value : ");
            arr[i]=s.nextInt();
        }
        try
        {
            System.out.println("Enter search index value : ");
            int index=s.nextInt();
            System.out.println(arr[index]);
            System.out.println("Enter the number to divide search element with : ");
            int div=s.nextInt();
            System.out.println(arr[index]/div);
            String name=null;
            System.out.println(name.length());
        }
        catch(ArrayIndexOutOfBoundsException e1)
        {
            System.out.println("Array is out of bound");
        }
        catch(ArithmeticException e2)
        {
            System.out.println("Arithmetic Exception");
        }
        catch(NullPointerException e3)
        {
            System.out.println("Null Pointer Exception");
        }
    }
}