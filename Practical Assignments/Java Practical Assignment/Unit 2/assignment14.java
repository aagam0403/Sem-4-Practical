import java.util.PriorityQueue;
public class assignment14 
{
    public static void main(String[] args) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(25);
        pq.add(5);
        pq.add(15);
        pq.add(30);
        pq.add(2);
        pq.add(8);
        pq.add(20);
        pq.add(1);
        pq.add(50);
        System.out.println("Minimum value in priority queue: " + pq.peek());
    }
}
