import java.awt.*;
import javax.swing.*;

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
