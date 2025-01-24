import java.util.Scanner;
class assignment2
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in) ;
        System.out.println("Enter the Farenheit = ");
        int faren=s.nextInt();
        int cel=(faren-32)*5/9;
        System.out.println("Celcius = "+cel);
    }
}