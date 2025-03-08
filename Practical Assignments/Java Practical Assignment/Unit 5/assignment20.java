import java.applet.Applet;
import java.awt.*;

public class assignment20 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(20, 50, 300, 50);
        
        g.drawRect(50, 70, 100, 30);
        g.drawRect(50, 110, 100, 30);
        
        g.setColor(Color.BLACK);
        g.fillRect(200, 70, 100, 30);
        g.fillRect(200, 110, 100, 30);
        
        g.setColor(Color.RED);
        g.drawOval(50, 170, 150, 70);
        
        g.setColor(Color.RED);
        g.fillOval(200, 170, 150, 70);
    }
}

/* HTML file to run the applet

<html>
  <body>
    <applet code="assignment20.class" width="400" height="300"></applet>
  </body>
</html>

*/