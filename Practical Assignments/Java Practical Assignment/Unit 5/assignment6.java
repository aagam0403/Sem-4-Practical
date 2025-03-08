/* HTML File to run this applet:

   <html>
   <body>
   <applet code="assignment6.class" width="400" height="400"></applet>
   </body>
   </html>
*/

import java.applet.Applet;
import java.awt.*;

public class assignment6 extends Applet {
    public void paint(Graphics g) {
        int centerX = 200;
        int centerY = 200;
        int radius = 100;
        
        // Draw circle
        g.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
        
        // Draw 8 equal sections
        for (int i = 0; i < 8; i++) {
            double angle = Math.toRadians(i * 45);
            int x = centerX + (int) (radius * Math.cos(angle));
            int y = centerY + (int) (radius * Math.sin(angle));
            g.drawLine(centerX, centerY, x, y);
        }
    }
}
