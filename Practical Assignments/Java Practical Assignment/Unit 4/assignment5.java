import javax.swing.JOptionPane;

class NoMatchException extends Exception 
{
    public NoMatchException(String message) 
    {
        super(message);
    }
}

public class assignment5
{
    public static void main(String[] args) 
    {
        String userInput = JOptionPane.showInputDialog("Enter a string:");
        try 
        {
            if (!"internet".equals(userInput)) 
            {
                throw new NoMatchException("No Match Exception: Input does not match 'internet'");
            }
            else
            {
                System.out.print("Correct Input");
            }
        } 
        catch (NoMatchException e) 
        {
            System.out.print(e.getMessage());
        }
    }
}
