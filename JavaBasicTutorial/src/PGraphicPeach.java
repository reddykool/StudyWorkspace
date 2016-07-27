import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

public class PGraphicPeach extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.fillRect(20, 20, 70, 40);
		
		g.setColor(new Color(190,30,255)); //Custom Color - RGB
		g.fillRect(20, 80, 70, 40);
		
		g.setColor(Color.RED);
		g.drawString("Graphics programming... ", 25, 150);
	}

}

/*
public class MainForAll {
	
	  public static void main(String args[]) {
		  System.out.println("****   START of program  *****");
		  
		  JFrame frame = new JFrame("Puru Graphics");
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		  PGraphicPeach obj = new PGraphicPeach();
		  frame.add(obj);
		  frame.setSize(400, 500);
		  frame.setVisible(true);
		  
		  System.out.println("****   END of program  *****");
		}
	}
*/