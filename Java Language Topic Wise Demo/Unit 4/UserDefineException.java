import java.util.*;
class VotingAgeCheck
{
    int age;
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter Age : ");
        age = sc.nextInt();
    }
    void checkAge() throws Exception
    {
        if(age>18)
        {
            System.out.println("You Can Vote!");
        }
        else
        {
            throw new Exception();
        }
    }
}
public class UserDefineException 
{
    public static void main(String args[]) 
    {
        VotingAgeCheck v = new VotingAgeCheck();
        v.getData();
        try
        {
            v.checkAge();
        }
        catch(Exception e)
        {
            System.out.println(" Error Age is incorrect!!");
        }
    }
}