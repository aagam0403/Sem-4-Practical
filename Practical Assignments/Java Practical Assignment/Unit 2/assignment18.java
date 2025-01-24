import java.util.PriorityQueue;
public class assignment18 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(5);
        pq.add(15);
        pq.add(10);
        pq.add(20);
        pq.add(25);

        System.out.println("Peek (top element): " + pq.peek());
        System.out.println("Poll (removed element): " + pq.poll());
        System.out.println("Priority Queue after poll: " + pq);
        System.out.println("Contains 10: " + pq.contains(10));
    }
}