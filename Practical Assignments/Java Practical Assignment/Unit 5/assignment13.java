/* HTML File to run this applet:

   <html>
   <body>
   <applet code="assignment13.class" width="400" height="400"></applet>
   </body>
   </html>
*/

import java.applet.Applet;
import java.awt.*;

public class assignment13 extends Applet {
    public void paint(Graphics g) {
        // Draw house body
        g.setColor(Color.RED);
        g.fillRect(100, 150, 150, 150);
        g.setColor(Color.BLACK);
        g.drawRect(100, 150, 150, 150);
        
        // Draw roof
        int[] xPoints = {90, 175, 260};
        int[] yPoints = {150, 80, 150};
        g.setColor(Color.BLACK);
        g.fillPolygon(xPoints, yPoints, 3);
        g.drawPolygon(xPoints, yPoints, 3);
        
        // Draw door
        g.setColor(Color.DARK_GRAY);
        g.fillRect(180, 220, 40, 80);
        g.setColor(Color.BLACK);
        g.drawRect(180, 220, 40, 80);
        
        // Draw window
        g.setColor(Color.WHITE);
        g.fillRect(120, 180, 40, 40);
        g.setColor(Color.BLACK);
        g.drawRect(120, 180, 40, 40);
        
        // Window grid
        g.drawLine(140, 180, 140, 220);
        g.drawLine(120, 200, 160, 200);
        
        // Chimney
        g.setColor(new Color(139, 69, 19)); // Brown color
        g.fillRect(200, 90, 20, 40);
        g.setColor(Color.BLACK);
        g.drawRect(200, 90, 20, 40);
    }
}