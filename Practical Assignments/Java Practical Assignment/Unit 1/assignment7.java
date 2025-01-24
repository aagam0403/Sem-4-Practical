import javax.swing.JOptionPane;
public class assignment7 {
    assignment7(int a)
    {
        if(a%2==0)
        {
            System.out.println(" number is even");
        }
        else
        {
            System.out.println(" number is odd");
        }
    }
    public static void main(String args[])
    {
        int a = Integer.parseInt(JOptionPane.showInputDialog(" Enter A : "));
        assignment7 S = new assignment7(a);
    }
}