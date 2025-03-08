/* HTML File to run this applet:

   <html>
   <body>
   <applet code="assignment7.class" width="500" height="500"></applet>
   </body>
   </html>
*/

import java.applet.Applet;
import java.awt.*;

public class assignment7 extends Applet {
    Image img;
    
    public void init() {
        img = getImage(getDocumentBase(), "image.jpg");
    }
    
    public void paint(Graphics g) {
        g.drawImage(img, 50, 50, this); 
    }
}
