/* HTML File to run this applet:

   <html>
   <body>
   <applet code="assignment12.class" width="400" height="400"></applet>
   </body>
   </html>
*/

import java.applet.Applet;
import java.awt.*;

public class assignment12 extends Applet {
    public void paint(Graphics g) {
        // Draw house body
        g.setColor(Color.YELLOW);
        g.fillRect(120, 150, 150, 150);
        g.setColor(Color.BLACK);
        g.drawRect(120, 150, 150, 150);
        
        // Draw roof
        int[] xPoints = {100, 195, 290};
        int[] yPoints = {150, 80, 150};
        g.setColor(Color.BLUE);
        g.fillPolygon(xPoints, yPoints, 3);
        g.drawPolygon(xPoints, yPoints, 3);
        
        // Draw door
        g.setColor(Color.GRAY);
        g.fillRect(180, 230, 40, 70);
        g.setColor(Color.BLACK);
        g.drawRect(180, 230, 40, 70);
        g.fillOval(215, 265, 5, 5); // Door knob
        
        // Draw windows
        g.setColor(Color.BLUE);
        g.fillRect(140, 170, 30, 30);
        g.fillRect(220, 170, 30, 30);
        g.setColor(Color.BLACK);
        g.drawRect(140, 170, 30, 30);
        g.drawRect(220, 170, 30, 30);
        
        // Draw ground line
        g.setColor(Color.GREEN);
        g.fillRect(80, 300, 250, 10);
        
        // Draw stop sign pole
        g.setColor(Color.BLACK);
        g.fillRect(280, 210, 5, 90);
        
        // Draw stop sign (octagon)
        g.setColor(Color.RED);
        int[] stopX = {275, 285, 295, 295, 285, 275, 265, 265};
        int[] stopY = {200, 200, 210, 220, 230, 230, 220, 210};
        g.fillPolygon(stopX, stopY, 8);
        g.setColor(Color.BLACK);
        g.drawPolygon(stopX, stopY, 8);
        
        // Draw STOP text
        g.setColor(Color.WHITE);
        g.drawString("STOP", 277, 218);
    }
}