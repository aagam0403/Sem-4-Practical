/* HTML File to run this applet:

   <html>
   <body>
   <applet code="assignment11.class" width="500" height="500"></applet>
   </body>
   </html>
*/

import java.applet.Applet;
import java.awt.*;

public class assignment11 extends Applet {
    public void paint(Graphics g) {
        int width = 500;
        int height = 500;
        int circleDiameter = 200;
        int circleX = (width - circleDiameter) / 2;
        int circleY = (height - circleDiameter) / 2;
        
        // Draw circle
        g.setColor(Color.BLACK);
        g.drawOval(circleX, circleY, circleDiameter, circleDiameter);
        
        // Display name centered inside the circle
        String name = "Your Name"; // Change this to your actual name
        FontMetrics fm = g.getFontMetrics();
        int textWidth = fm.stringWidth(name);
        int textHeight = fm.getHeight();
        
        int textX = circleX + (circleDiameter - textWidth) / 2;
        int textY = circleY + (circleDiameter + textHeight) / 2 - 5;
        
        g.drawString(name, textX, textY);
    }
}