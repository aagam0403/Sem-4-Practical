import java.applet.Applet;
import java.awt.*;

public class assignment22 extends Applet {
    public void paint(Graphics g) {
        setBackground(Color.YELLOW);
        
        g.setColor(Color.BLACK);
        g.drawRect(50, 50, 300, 200);
        g.setColor(new Color(255, 228, 196));
        g.fillOval(50, 50, 300, 200);
        
        int[] x1 = {200, 250, 200, 150};
        int[] y1 = {100, 150, 200, 150};
        g.setColor(Color.ORANGE);
        g.fillPolygon(x1, y1, 4);
        
        int[] x2 = {150, 200, 200, 150};
        int[] y2 = {150, 200, 200, 150};
        g.setColor(Color.GREEN);
        g.fillPolygon(x2, y2, 4);
        
        int[] x3 = {200, 250, 250, 200};
        int[] y3 = {200, 150, 200, 250};
        g.setColor(Color.BLUE);
        g.fillPolygon(x3, y3, 4);
        
        g.setColor(Color.CYAN);
        g.fillRect(175, 150, 50, 50);
        
        g.setColor(Color.RED);
        g.fillOval(175, 150, 50, 50);
    }
}

/* HTML file to run the applet

<html>
  <body>
    <applet code="DrawShapes.class" width="400" height="300"></applet>
  </body>
</html>

*/
