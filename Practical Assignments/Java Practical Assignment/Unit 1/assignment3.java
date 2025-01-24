import java.util.*;
class assignment3
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Hourly Rate : ");
        int hrate = s.nextInt();
        System.out.println("Enter Total no of Hours worked : ");
        int nohour = s.nextInt();
        int gross = hrate*nohour;
        float tax=0.75f;
        float netsal = gross-tax;
        System.out.println("Gross Salary = "+gross);
        System.out.println("Net Salary = "+netsal);
    }
}