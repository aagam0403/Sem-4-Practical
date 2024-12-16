import javax.swing.JOptionPane;
class DialogueBox
{
    public static void main(String[] args) 
    {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a Value 1= "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter a Value 2 = "));
        System.out.println(a+b);    
    }
}