// 10. Write a program to draw below image using Applet -

import java.applet.Applet;
import java.awt.*;

public class Q10Ghar extends Applet {
    @Override
    public void paint(Graphics g) {
        // Draw house body
        g.setColor(Color.YELLOW);
        g.fillRect(120, 150, 150, 150);
        g.setColor(Color.BLACK);
        g.drawRect(120, 150, 150, 150);

        // Draw roof
        int[] xPoints = { 100, 195, 290 };
        int[] yPoints = { 150, 80, 150 };
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
    }
}
