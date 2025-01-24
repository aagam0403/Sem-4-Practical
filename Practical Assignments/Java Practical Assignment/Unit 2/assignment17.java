import java.util.Stack;
public class assignment17 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Peep (top element): " + stack.peek());
        System.out.println("Pop (removed element): " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        System.out.println("Search for element 20: " + stack.search(20));
    }
}