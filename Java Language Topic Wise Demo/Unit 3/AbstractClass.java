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
        //super.display();
        System.out.println("B : "+b);
    }
}
class AbstractClass
{
    public static void main(String[] args) 
    {
        DummyClass c = new DummyClass();//creating object of parent(abstract) class using child class
        c.display();
        c.display1(); //will give error as parent class cannot access Child class content
    }
}