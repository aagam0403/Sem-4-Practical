class SuperClass {
    String message;

    public SuperClass(String message) 
    {
        this.message = message;
        System.out.println("SuperClass Constructor: " + message);
    }
}

class SubClass extends SuperClass 
{
    int number;

    public SubClass(String message, int number) 
    {
        super(message);
        this.number = number;
        System.out.println("SubClass Constructor: Number = " + number);
    }
}

public class assignment7 
{
    public static void main(String[] args) 
    {
        SubClass obj = new SubClass("Hello from SuperClass!", 100);
    }
}
