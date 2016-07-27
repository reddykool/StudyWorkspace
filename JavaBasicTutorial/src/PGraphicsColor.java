import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PGraphicsColor extends JFrame {
	private JButton button;
	private Color color = Color.WHITE;
	private JPanel panel;
	
	public PGraphicsColor() {
		super("Puru Color Chooser");
		panel = new JPanel();
		panel.setBackground(color);
		
		button = new JButton("Choose Color");
		button.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						color = JColorChooser.showDialog(null, "Pick your Color", color);
						if(color==null)
							color = Color.WHITE;
						
						panel.setBackground(color);
					}
				}
			);
		add(panel, BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
		setSize(450,500);
		setVisible(true);
	}
	

}

/*
public class MainForAll {
	
	  public static void main(String args[]) {
		  System.out.println("****   START of program  *****");
		  
		  PGraphicsColor obj = new PGraphicsColor();
		  obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
		  System.out.println("****   END of program  *****");
		}
	}
*/