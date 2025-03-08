import java.applet.Applet;
import java.awt.*;

public class assignment18 extends Applet {
    public void paint(Graphics g) {
        int[] xPoints = {150, 180, 210, 200, 175, 125, 100};
        int[] yPoints = {100, 80, 100, 130, 150, 150, 130};
        int nPoints = 7;
        
        g.setColor(Color.GRAY);
        g.fillPolygon(xPoints, yPoints, nPoints);
        
        g.setColor(Color.BLACK);
        g.drawString("Heptagon", 140, 180);
    }
}

/* HTML file to run the applet

<html>
  <body>
    <applet code="assignment18.class" width="300" height="200"></applet>
  </body>
</html>

*/
