//write a java program to perform the following task using array list of integer values
//1. Create array list and add 5 integers (user input)
//2. Display the content of array list
//3. Update the array list 3rd element with a new value (entered by the user)
//4. remove the element at index1
//5. display the updated array list
//6. print the size of array list
//Collections in java
import java.util.*;
class collections1
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        System.out.println("1. Create array list and add 5 integers (user input)");
        System.out.println("Enter 5 values = ");
        for(int i=0;i<5;i++)
        {
            a.add(s.nextInt());
        }

        System.out.println("");
        System.out.println("2. Display the content of array list");
        System.out.println(a);
        
        System.out.println("");
        System.out.println("3. Update the array list 3rd element with a new value (entered by the user)");
        System.out.println("Enter a value : ");
        a.set(3,s.nextInt());
        System.out.println("After Set : "+a);

        System.out.println("");
        System.out.println("4. remove the element at index1");
        a.remove(1);
        System.out.println("After Removing : "+a);
        
        System.out.println("");
        System.out.println("5. display the updated array list");
        System.out.println(a);

        System.out.println("");
        System.out.println("6. print the size of array list");
        System.out.println("Size of Array : "+a.size());
    }
}