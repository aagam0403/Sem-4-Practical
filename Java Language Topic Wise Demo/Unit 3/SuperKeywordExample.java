import java.util.*;
class bank
{
    int a;
    bank(int accNo)
    {
        a = accNo;
    }
    void display(int a)
    {
        System.out.println(" Account no is : " +a);
    }
}
class person extends bank
{
    String name;
    person(String n, int acc)
    {
        super(acc);
        super.display(acc);
        
        name = n;
    }
    void display()
    {
        System.out.println(" Account no of the perosn is : " +super.a+ " name of the person is : " +name);
    }
}
class SuperKeywordExample
{
    public static void main(String args[])
    {
        person p = new person("Aagam",123);
        p.display();
    }
}