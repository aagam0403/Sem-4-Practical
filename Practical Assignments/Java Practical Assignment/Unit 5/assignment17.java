import java.applet.Applet;
import java.awt.*;

public class assignment17 extends Applet {
    public void paint(Graphics g) {
        int[] xPoints = {150, 180, 210, 180, 150, 120};
        int[] yPoints = {100, 80, 100, 140, 140, 120};
        int nPoints = 6;
        
        g.setColor(Color.GRAY);
        g.fillPolygon(xPoints, yPoints, nPoints);
        
        g.setColor(Color.BLACK);
        g.drawString("Hexagon", 140, 180);
    }
}

/* HTML file to run the applet

<html>
  <body>
    <applet code="assignment17.class" width="300" height="200"></applet>
  </body>
</html>

*/