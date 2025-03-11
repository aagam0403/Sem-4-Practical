import java.applet.Applet;
import java.awt.*;
public class assignment5 extends Applet 
{

    public void init() 
    {
        // Set background and foreground colors
        setBackground(Color.CYAN);
        setForeground(Color.RED);
    }

    public void paint(Graphics g) 
    {
        // Set font color, face, and size
        g.setFont(new Font("Serif", Font.BOLD, 20));
        g.setColor(Color.BLUE);
        g.drawString("Applet with Custom Colors and Fonts", 50, 50);

        // Draw a rectangle and fill it with color
        g.setColor(Color.GREEN);
        g.fillRect(100, 100, 200, 100);
        
        // Draw rectangle border
        g.setColor(Color.BLACK);
        g.drawRect(100, 100, 200, 100);
    }
}
