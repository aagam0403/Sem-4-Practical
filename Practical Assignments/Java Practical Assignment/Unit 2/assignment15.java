import java.util.ArrayList;
import java.util.Collections;
public class assignment15 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(3);
        list.add(8);
        list.add(20);
        list.add(10);

        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Contains 8: " + list.contains(8));
        list.remove(3);
        System.out.println("After removing element at index 3: " + list);
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }
}