import java.awt.Graphics;

import javax.swing.JApplet;


//1. Applet code saved as xyz.html 
/*
<html>
    <head>
        <title>Hello World!</title>
    </head>
    <body> Hello World Applet
        <applet code = "PAppletHelloWorld.class" width="300" height="300">

            Your Browser has not enabled Java !?!
                 OR
            Your java security has disabled openignin local files as applet !?! 

            + Enable java in your Browser :
            * https://java.com/en/download/help/enable_browser.xml 

            + Edit security settings:         
              Follow below steps in UBUNTU
              * open java Control panel
              * /usr/lib/jvm/java-8-oracle/bin$ ./ControlPanel
              * Go to secuirty tab
              * add "file:///" to exception list
              * press apply/Ok
            + now retry to run applet. 

        </applet>
    </body>
</html>
*/

//2. copy .class files to same location where you have .html


public class PAppletHelloWorld extends JApplet{
	
	public void paint(Graphics g) {
		g.drawString("Hello There!!!", 25, 45);
		//g.drawArc(40, 50, 10, 10, 0, 90);
	}

}
