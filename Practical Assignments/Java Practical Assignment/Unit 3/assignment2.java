import java.util.*;
class Employee
{
    String Ename;
    String Edesi;
    public Employee(String Ename, String Edesi)
    {
        this.Ename=Ename;
        this.Edesi=Edesi;
    }
    public void display()
    {
        System.out.println("Employee Name = "+Ename);
        System.out.println("Employee Designation = "+Edesi);
    }
}
class sal extends Employee
{
    double Esalary;
    public sal(String Ename, String Edesi,double Esalary)
    {
        super(Ename,Edesi);
        this.Esalary=Esalary;
    }
    public void display1()
    {
        super.display();
        System.out.println("Employee Name = "+Esalary);
    }
}
class assignment2
{
    public static void main(String args[])
    {
        sal s = new sal("Aagam","Manager",75000);
        s.display1();
    }
}