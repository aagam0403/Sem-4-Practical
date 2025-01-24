import java.util.*;
class assignment9
{
    assignment9(double b, double h)
    {
        double areatr=(0.5*(b*h));
        System.out.println("Area of Triangle = "+areatr);
    }
    assignment9(int l, int w)
    {
        int arearec=l*w;
        System.out.println("Area of rectangle:"+arearec);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        assignment9 a=new assignment9(3.0,2.0);
        assignment9 b=new assignment9(5,6);
    }
}