import java.applet.Applet;
import java.awt.*;

public class assignment14 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(100, 100, 200, 200);
        
        g.setColor(Color.GREEN);
        g.fillOval(150, 150, 20, 30);
        g.fillOval(230, 150, 20, 30);
        
        g.setColor(Color.BLACK);
        g.fillOval(190, 180, 20, 20);
        
        g.setColor(Color.RED);
        g.drawArc(150, 220, 100, 50, 0, 180);
    }
}

<html>
  <body>
    <applet code="assignment14.class" width="400" height="400"></applet>
  </body>
</html>
