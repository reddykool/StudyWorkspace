import java.awt.*;
import javax.swing.*;


/*
 Applet may not work because:
 1. Your Browser has not enabled Java !?!
     OR
 2. Your java security has disabled opening local files as applet !?!
  
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
 */


//1. Applet code saved as xyz.html 
/*
<html>
<head>
<title>Hello world Applet</title>
</head>
<body> body working
<applet code="PAppletBasic.class" width="300" height="300">
</applet>
</body>
</html>
*/

//2. copy .class files to same location where you have .html

public class PAppletBasic extends JApplet {
	
	private double n1,n2,sum;
	
	public void init() {
		String fn = JOptionPane.showInputDialog("Enter first num");
		String sn = JOptionPane.showInputDialog("Enter Second num");
		
		n1 = Double.parseDouble(fn);
		n2 = Double.parseDouble(sn);
		
		sum = n1 + n2;
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("Num1   :"+n1, 25, 15);
		g.drawString("Num2   :"+n2, 25, 35);
		g.drawString("Sum is :"+sum, 25, 55);
	}
	
}
