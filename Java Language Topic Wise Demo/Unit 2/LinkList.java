import java.util.*;
class LinkList
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> l = new LinkedList<>();
        
        //Creating linklist and adding values to linked list
        l.add(25);
        l.add(78);
        l.add(24);
        System.out.println(l);

        //Adding value to first node
        l.addFirst(1);
        System.out.println(l);

        //Adding value to last node
        l.addLast(4);
        System.out.println(l);

        //clear contains
        System.out.println(l.contains(1));

        //Getting value from link list
        System.out.println(l.get(2));
        System.out.println(l.getFirst());
        System.out.println(l.getLast());

        //Removing values from link list
        System.out.println(l.remove(2));
        System.out.println(l.removeFirst());
        System.out.println(l.removeLast());
        System.out.println(l);

        //Size of Linked List
        System.out.println(l.size());

        //Sort the values of linked list
        l.add(46);
        l.add(2);
        l.add(32);
        Collections.sort(l);
        System.out.println(l);

        //Clear Linked List
        l.clear();
        System.out.println(l);

    }
}