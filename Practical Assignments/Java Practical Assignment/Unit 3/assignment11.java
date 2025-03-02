interface Area 
{
    void compute(float length, float width);
}

class rect implements Area 
{
    public void compute(float length, float width) 
    {
        float area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }
}

public class assignment11 
{
    public static void main(String[] args) 
    {
        rect r = new rect();
        r.compute(12, 2);
    }
}
