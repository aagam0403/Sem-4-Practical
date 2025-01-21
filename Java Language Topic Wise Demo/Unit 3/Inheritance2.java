class Marks
{
    static int total=0;
    static int calculateMarks(int... n)
    {
        for(int i : n)
        {
            total+=i;
        }
        return total;
    }
}
class Grade extends Marks
{
    static String gradeCheck()
    {
        if(total>50)
        {
            return "A";
        }
        else
        {
            return "B";
        }
    }
}
public class Inheritance2 extends Grade
{
    public static void main(String[] args) 
    {
        System.out.println("Grade : "+gradeCheck());
        System.out.println("Total Marks : "+calculateMarks(44,34,32,21,23));    
    }
}