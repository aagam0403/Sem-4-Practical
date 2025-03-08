import java.applet.Applet;
import java.awt.*;

public class assignment19 extends Applet {
    public void paint(Graphics g) {
        int[] xPoints = {150, 180, 210, 230, 230, 210, 180, 150, 130, 130};
        int[] yPoints = {100, 80, 80, 100, 130, 150, 150, 130, 130, 100};
        int nPoints = 10;
        
        g.setColor(Color.GRAY);
        g.fillPolygon(xPoints, yPoints, nPoints);
        
        g.setColor(Color.BLACK);
        g.drawString("Decagon", 140, 180);
    }
}

/* HTML file to run the applet

<html>
  <body>
    <applet code="assignment19.class" width="300" height="200"></applet>
  </body>
</html>

*/