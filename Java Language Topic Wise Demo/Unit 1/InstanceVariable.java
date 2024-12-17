//Instance Variable
//Instance Variable means variable that is declared inside a class but
//calling outside of any method, Constructor or block
import java.util.*;
class Marks
{
    int englishmarks;
    int mathsmarks;
    float totalmarks;
}
class InstanceVariable
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        Marks m = new Marks();
        System.out.println("Enter English Marks = ");
        m.englishmarks = s.nextInt();
        System.out.println("Enter Maths Marks = ");
        m.mathsmarks = s.nextInt();
        m.totalmarks=(m.englishmarks+m.mathsmarks);
        System.out.println(m.totalmarks);
    }
}