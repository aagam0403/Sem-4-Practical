//Write a program to demonstrate the use of static keyword with function
import java.util.*;
class Student
{
    public static int rollno;
    static String name;
}
class StaticKeyword1
{
    public static void main(String[] args) 
    {
        System.out.println("Static Keyword");
        StaticKeyword1 s1 = new StaticKeyword1();
        s1.details();
    }
    void details()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name = ");
        Student.name = s.nextLine();
        System.out.println("Enter Roll No. = ");
        Student.rollno = s.nextInt();
        System.out.println("Name = "+Student.name);    
        System.out.println("Roll no = "+Student.rollno);
    }
}