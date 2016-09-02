import java.awt.*;
import javax.swing.*;

public class PDrawOval extends JPanel {
	
	private int dia = 10;
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		g.fillOval(60, 10, dia/2, dia);
	}
	
	public void setDia(int newDia) {
		dia = (newDia>=0 ? newDia:dia);
		repaint();
	}
		
	public Dimension getPreferredSize() {
		return new Dimension(200,200);
	}
	
	public Dimension getMinimumSize() {
		return getPreferredSize();
	}
	
}

/*
public static void main(String args[]) {
	System.out.println("****   START of program  *****");
	PWindow w = new PWindow();
	w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	w.setSize(250, 300);
	w.setVisible(true);
	System.out.println("****   END of program  *****");		
}
*/