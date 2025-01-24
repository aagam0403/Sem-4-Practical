import java.util.Stack;
public class assignment13 
{
    public static void main(String[] args) 
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(5);
        stack.push(8);
        stack.push(3);
        stack.push(15);

        int min = stack.peek();
        for (int value : stack) 
        {
            if (value < min) 
            {
                min = value;
            }
        }
        System.out.println("Minimum value in stack: " + min);
    }
}
