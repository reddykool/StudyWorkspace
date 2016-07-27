import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PGraphicsDrawing extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.drawLine(10, 25, 200, 45);
		
		g.setColor(Color.RED);
		g.fillOval(10, 55, 100, 30);
		
		g.setColor(Color.GREEN);
		g.drawRect(10, 105, 100, 30);
		
		g.setColor(Color.ORANGE);
		g.fillRect(10, 150, 100, 30);
		
		g.setColor(Color.CYAN);
		g.fill3DRect(10, 200, 100, 50, true);
	}

}

/*
public class MainForAll {
	
	  public static void main(String args[]) {
		  System.out.println("****   START of program  *****");
		  
		  JFrame frame = new JFrame("Puru Graphics");
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		  PGraphicsDrawing obj = new PGraphicsDrawing();
		  frame.add(obj);
		  frame.setSize(400, 500);
		  frame.setVisible(true);
		  
		  System.out.println("****   END of program  *****");
		}
	}
*/
