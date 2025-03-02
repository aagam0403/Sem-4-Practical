import java.util.*;
interface shape
{
    double calculatecircle();
}
interface shaper
{
    double calculaterect();
}
interface shapes
{
    double calculatesqu();
}
class circle implements shape
{
    double radius;
    public circle(double radius) 
    {
        this.radius=radius;
    }
    public double calculatecircle()
    {
        return 3.1416*radius*radius;
    }
}
class rect implements shaper
{
    double length;
    double width;
    public rect(double length, double width)
    {
        this.length=length;
        this.width=width;
    }
    public double calculaterect()
    {
        return length*width;
    }
}
class square implements shapes
{
    double a;
    public square(double a) 
    {
        this.a=a;
    }
    public double calculatesqu()
    {
        return a*a;
    }
}
class assignment4
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Area of Circle...");
        System.out.println("Enter Radius : ");
        double radius = s.nextDouble();
        circle c = new circle(radius);
        System.out.println("Area of Circle: " + c.calculatecircle());    

        System.out.println("");
        System.out.println("Area of Rectange Now...");
        System.out.println("Enter Length : ");
        double length = s.nextDouble();
        System.out.println("Enter Width : ");
        double width = s.nextDouble();
        rect r = new rect(length,width);
        System.out.println("Area of Rectangle : " + r.calculaterect());    

        System.out.println("");
        System.out.println("Area of Square Now...");
        System.out.println("Enter A : ");
        double a = s.nextDouble();
        square sq = new square(a);
        System.out.println("Area of Square : " + sq.calculatesqu());
    }
}