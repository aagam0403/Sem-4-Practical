import java.applet.Applet;
import java.awt.*;

public class assignment16 extends Applet {
    public void paint(Graphics g) {
        // Draw Triangle
        int[] xTriangle = {50, 100, 150};
        int[] yTriangle = {150, 50, 150};
        g.setColor(Color.GRAY);
        g.fillPolygon(xTriangle, yTriangle, 3);
        g.setColor(Color.BLACK);
        g.drawString("Triangle", 80, 170);
        
        // Draw Rectangle
        g.setColor(Color.GRAY);
        g.fillRect(180, 80, 100, 80);
        g.setColor(Color.BLACK);
        g.drawString("Rectangle", 200, 180);
        
        // Draw Pentagon
        int[] xPentagon = {350, 400, 450, 430, 370};
        int[] yPentagon = {120, 80, 120, 170, 170};
        g.setColor(Color.GRAY);
        g.fillPolygon(xPentagon, yPentagon, 5);
        g.setColor(Color.BLACK);
        g.drawString("Pentagon", 380, 190);
    }
}

/* HTML file to run the applet

<html>
  <body>
    <applet code="assignment16.class" width="500" height="250"></applet>
  </body>
</html>

*/