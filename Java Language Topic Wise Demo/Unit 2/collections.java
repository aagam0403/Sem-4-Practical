//Collections in java
import java.util.*;
class collections
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        a.add(1);
        a.add(15);
        a.add(24);
        a.add(98);
        System.out.println(a);
        
        a.remove(2);
        System.out.println("After Removing : "+a);
        
        a.set(0,52);
        //a.set means a type of replacing the values
        //0 is index & 52 is Value
        System.out.println("After Set : "+a);
        
        System.out.println("Size of Array : "+a.size());

        //indexOf(element)
        System.out.println("Index of Array : "+a.indexOf(98));

        //contains(element)
        System.out.println("Contains of Array (True/False) : "+a.contains(51));

        //add(index,element)
        a.add(2,3);
        System.out.println("Array Add : "+a);

        //sort(listname)
        Collections.sort(a);
        System.out.println("After Sorting array list is : " +a);

        //isEmpty()
        System.out.println("Array List is empty (True/False) : " +a.isEmpty());

        //clear()
        a.clear();
        System.out.println("Array List Cleared : "+a);        
    }
}