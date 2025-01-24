import java.util.*;
class assignment13
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int marks = s.nextInt();
        if (marks>60 && marks<=100)
        {
            System.out.println("Grade = A");
        }
        else if(marks<60 && marks>=40)
        {
            System.out.println("Grade = B");
        }
        else if(marks<40 && marks>0)
        {
            System.out.println("Grade = C");
        }
        else
        {
            System.out.println("Invalid Value");
        }
    }
}