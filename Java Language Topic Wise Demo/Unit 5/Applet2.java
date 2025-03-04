import java.applet.Applet;
import java.awt.*;
public class Applet2 extends Applet
{
    public void init()
    {
        setBackground(Color.CYAN);
        setForeground(Color.GREEN);
    }
    public void paint(Graphics g)
    {
        g.drawString("Hello java",150,150);
    }
}
/*
<applet code="Applet3_1" width=200 height=200>
</applet>
*/