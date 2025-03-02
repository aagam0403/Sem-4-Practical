import java.awt.*;
import java.applet.Applet;
public class AppletExample1 extends Applet
{
    public void init()
    {
        setBackground(Color.RED);
    }
    public void paint (Graphics g)
    {
        g.setColor(Color.GREEN);
        g.drawString("Welcome to Applet",150,150);
        g.drawRect(200, 200, 100, 50);
    }
}
/*
 * <applet code="AppletExample1.class" width=400 height=400>
 * </applet>
 */