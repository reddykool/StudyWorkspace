import java.awt.Graphics;

import javax.swing.JApplet;

/*
<applet code = "PAppletHelloWorld" width = 200 height = 200>
</applet>
*/

public class PAppletHelloWorld extends JApplet{
	
	public void paint(Graphics g) {
		g.drawString("Hello There!!!", 25, 45);
		g.drawArc(40, 50, 10, 10, 0, 90);
	}

}
