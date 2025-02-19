import java.util.*;
public class StringDemo 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Name = ");
        String name = s.nextLine();
        
        //String to Lower Case
        System.out.println("String to Upper Case = " +name.toUpperCase());
        
        //String to Lower Case
        System.out.println("String to Lower Case = " +name.toLowerCase());
        
        //Removing Unwanted Space
        System.out.println(name.trim());

        //Length of using after trim
        System.out.println((name.trim()).length());

        if(name.equals("Aagam"))
        {
            System.out.println("Dashboard Open");
        }
    }
}