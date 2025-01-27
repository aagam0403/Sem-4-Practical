//Super Keyword (used for access members and methods)
class Student
{
    String name; //Instance Variable
    void display(String n)
    {
        name=n;
        System.out.println("Name = "+n);
    }
}
class Marks extends Student
{
    int marks;
    void display(int m, String n)
    {
        marks=m;
        super.display(n);
        System.out.println("Marks is = "+m);
    }
}
class super_keyword
{
    public static void main(String[] args) 
    {
        Marks m = new Marks();
        m.display(12,"Aagam");    
    }
}