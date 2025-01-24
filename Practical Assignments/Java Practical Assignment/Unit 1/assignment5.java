import java.util.*;
class assignment5
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        int rad=s.nextInt();
        float arcirc=3.1416f*rad*rad;
        System.out.println("Area of Circle = "+arcirc); 
    }
}