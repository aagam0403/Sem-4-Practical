interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

class MultipleInheritanceDemo implements InterfaceA, InterfaceB {
    @Override
    public void methodA() 
    {
        System.out.println("MethodA from InterfaceA");
    }

    @Override
    public void methodB() 
    {
        System.out.println("MethodB from InterfaceB");
    }

    public void display() 
    {
        System.out.println("Multiple Inheritance using Interfaces in Java");
    }
}

public class assignment8 
{
    public static void main(String[] args) 
    {
        MultipleInheritanceDemo obj = new MultipleInheritanceDemo();
        obj.methodA();
        obj.methodB();
        obj.display();
    }
}