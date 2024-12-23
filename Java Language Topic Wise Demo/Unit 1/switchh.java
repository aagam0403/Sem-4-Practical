//wap to accept 2 integer using command line arguments
//and switch case create a simple calculator for add,sub,mul,div
import java.util.*;
class switchh{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice : ");
		int s = sc.nextInt();
		switch(s)
		{
			case 1 :
			System.out.println(a+b);
			break;
			case 2 :
			System.out.println(a-b);
			break;
			case 3 :
			System.out.println(a*b);
			break;
			case 4 :
			System.out.println(a%b);
			break;
			default :
			System.out.println("Invalid choice");
		}
	}
}