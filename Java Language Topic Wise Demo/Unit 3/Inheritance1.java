//Example of Single Inheritance
class Marks
{
    int total=0;
    int calculateMarks(int... n)
    {
        for(int i : n)
        {
            total+=i;
        }
        return total;
    }
}
class Student extends Marks
{
    void setName(String n)
    {
        System.out.println("Name : " +n);
        System.out.println("Total : "+calculateMarks(10,20,30,40));
    }
}
public class Inheritance1 extends Student
{
    public static void main(String[] args) 
    {
        Student s = new Student();
        s.setName(args[0]);
    }
}