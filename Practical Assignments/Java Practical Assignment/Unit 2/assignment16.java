import java.util.LinkedList;
public class assignment16 
{
    public static void main(String[] args) 
    {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        LinkedList<String> newItems = new LinkedList<>();
        newItems.add("Date");
        newItems.add("Elderberry");

        list.addAll(newItems);
        list.addFirst("Avocado");

        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Last index of 'Cherry': " + list.lastIndexOf("Cherry"));
        System.out.println("Final LinkedList: " + list);
    }
}