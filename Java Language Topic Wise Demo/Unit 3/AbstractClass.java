//Abstract Class 
abstract class Dummy
{
    int a=1;
    void display()
    {
        System.out.println("A : "+a);
    }
}
class DummyClass extends Dummy
{
    int b=2;
    void display1()
    {
        System.out.println("B : "+b);
    }
}
class AbstractClass
{
    public static void main(String[] args) 
    {
        DummyClass c = new DummyClass();
        c.display();
        c.display1(); 
    }
}
