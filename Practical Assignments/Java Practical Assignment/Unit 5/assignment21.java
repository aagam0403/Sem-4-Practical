import java.applet.Applet;
import java.awt.*;

public class assignment21 extends Applet {
    public void paint(Graphics g) {
        setBackground(Color.CYAN);
        
        g.setColor(Color.BLUE);
        g.fillRect(50, 200, 200, 50);
        
        g.setColor(Color.WHITE);
        g.fillOval(100, 150, 100, 100);
        g.fillOval(115, 100, 70, 70);
        g.fillOval(125, 60, 50, 50);
        
        g.setColor(Color.BLACK);
        g.fillRect(140, 50, 30, 20);
        g.drawOval(125, 60, 50, 50);
        g.fillOval(145, 80, 5, 5);
        g.fillOval(155, 80, 5, 5);
        g.drawArc(140, 90, 20, 10, 180, 180);
        
        g.drawLine(120, 130, 90, 100);
        g.drawLine(180, 130, 210, 120);
    }
}

/* HTML file to run the applet

<html>
  <body>
    <applet code="SnowmanApplet.class" width="300" height="300"></applet>
  </body>
</html>

*/