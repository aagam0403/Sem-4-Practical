class rect
{
    int length, width;
    rect(int length, int width)
    {
        this.length=length;
        this.width=width;
    }
    void area()
    {
        System.out.println("Area of Rectangle = "+length*width);
    }
    void perimeter()
    {
        System.out.println("Perimeter of Rectangle = "+(2*(length+width)));
    }
}
class box extends rect
{   
    int height;
    box(int length, int width, int height)
    {
        super(length,width);
        this.height=height;
    }
    void volume()
    {
        System.out.println("Volume of Box = "+(length*width*height));
    }
}
class assignment10
{
    public static void main(String[] args) 
    {
        rect r = new rect(10, 5);
        r.area();
        r.perimeter();

        box b = new box(10, 5, 4);
        b.area();  
        b.perimeter();
        b.volume();
    }
}