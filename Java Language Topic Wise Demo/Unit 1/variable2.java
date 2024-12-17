//One Class, Different Function
import java.util.*;
public class variable2
{ 
    void marks()
    {
        Scanner s = new Scanner(System.in);
        int math = 50, eng = 50; // default values
        float total;

        System.out.println("Enter marks for English and Math:");
        eng = s.nextInt(); // input for English marks
        math = s.nextInt(); // input for Math marks

        total = eng + math; // calculating total
        System.out.println("Total Marks: " + total);
    }

    public static void main(String[] args)
    {
        variable2 v = new variable2(); // Corrected class name here
        v.marks();
    }
}
