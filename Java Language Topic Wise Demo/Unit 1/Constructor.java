//write a java program to declare 2 variables roll no and name as insatnce variable.
//create a method name display details that displays rollno and name of 5 students.
//create another method to fetch the details of rollno and name of 5 diff students.
//(Hint : Create 5 diff obj of same class)
import java.util.*;
class Student
{
    int rollno;
    String name;
    Student()
    {
        rollno=2222;
        name="PQR";
    }
    Student(int r,String n1)
    {
        rollno=r;
        name=n1;
    }
    void fetchDetails(int rollnum, String name1)
    {
        rollno=rollnum;
        name=name1;
    }
    void displayDetails()
    {
        System.out.println("Roll Number = "+rollno);
        System.out.println("Name = "+name);
    }
}
class Constructor
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        Student s2 = new Student(1234,"Aagam");
        Student s3 = new Student();
        Student s4 = new Student(2345,"Sanghvi");
        Student s5 = new Student();

        s1.fetchDetails(21,"Aagam");
        s3.fetchDetails(21,"Aagam");
        s5.fetchDetails(21,"Aagam");

        System.out.println("Displaying Details...");
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
        s4.displayDetails();
        s5.displayDetails();
    }
}