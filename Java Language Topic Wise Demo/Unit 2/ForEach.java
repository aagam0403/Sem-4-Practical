public class ForEach 
{
    void setData(String... n)
    {
        System.out.println();
        System.out.println("Subject Name = ");
        for(String  i : n) //n value shifts to variable i (one by one)
        {
            System.out.println(i);
        }
    }
    
    public static void main(String args[])
    {
        ForEach e = new ForEach();
        e.setData("PHP");
        e.setData("PHP","Core Java");
        e.setData("PHP","CoreJava","Python");
    }  
}
