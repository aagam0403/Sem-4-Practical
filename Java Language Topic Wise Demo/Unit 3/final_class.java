//Final Class Demo
class Parent 
{
    final void display()
    {
        System.out.println("HI");
    }
}
class Child extends Parent
{
    void display1()
    {
        System.out.println("Hello");
    }
}

class final_class
{
    public static void main(String[] args) 
    {
        Child c = new Child();
        c.display();    
    }
}
