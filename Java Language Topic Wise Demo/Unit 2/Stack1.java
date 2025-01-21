//Stack Demo Code
import java.util.*;
class Stack1
{
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		Stack<Integer>  s = new Stack<>();
		for (int i=0; i<5; i++)
		{
			int val = a.nextInt();
			//Push means to add a value in stack (LIFO)
            s.push(val); 
		}
		System.out.println(s);
        
        //function to print only top element
		System.out.println("Top Element: "+s.peek());
		System.out.println(s);

        //function is to search the element
		System.out.println(s.search(20));

        //function is to delete the last node (LIFO)
		System.out.println("Delete top element: "+s.pop());
		System.out.println(s);

        //function is to check wheather the stack is empty or not
		if(s.isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			System.out.println("Stack has element");
		}
	}
}