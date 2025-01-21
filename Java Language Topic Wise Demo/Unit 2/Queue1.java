import java.util.*;
class Queue1
{
	public static void main(String[] args)
	{
		PriorityQueue<String> p = new PriorityQueue<>();
		//Add means to add value/string values to priority queue
		p.add("ABC");
		p.add("DEF");
		System.out.println(p);
		
		//if we want to add after the declaration of first time values
		p.offer("XYZ");
		System.out.println(p);

		//function is to check wheather the priority queue is empty or not
		if(!p.isEmpty())
		{
            //p.poll means prints the first value
			System.out.println(p.poll());
		}
		else
		{
			System.out.println("Queue is Empty");
		}
		//function is to clear the value of queue
		p.clear();

		//it gives output like the value is in queue or not (true/false)
		System.out.println(p.contains("ABC"));
	}
}