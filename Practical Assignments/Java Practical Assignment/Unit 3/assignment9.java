class Parent 
{
    void parentMethod() 
    {
        System.out.println("This is parent class");
    }
}

class Child extends Parent 
{
    void childMethod() 
    {
        System.out.println("This is child class");
    }
}

public class assignment9
{
    public static void main(String[] args) 
    {
        Parent p = new Parent();
        p.parentMethod();

        Child c = new Child();
        c.childMethod();
        c.parentMethod();
    }
}