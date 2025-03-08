import java.applet.Applet;
import java.awt.*;

public class assignment15 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(100, 100, 150, 150);
        
        g.setColor(Color.BLACK);
        g.fillOval(130, 140, 20, 20);
        g.fillOval(180, 140, 20, 20);
        
        g.drawLine(170, 170, 170, 190);
        g.drawLine(150, 200, 190, 200);
    }
}

/* HTML file to run the applet

<html>
  <body>
    <applet code="assignment15.class" width="400" height="400"></applet>
  </body>
</html>

*/