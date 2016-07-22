import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class PGui extends JFrame {
	private JButton reg;
	private JButton custom;
	
	public PGui() {
		super("Puru-Gui bar");
		setLayout(new FlowLayout());
		
		reg = new JButton("Reg Button");
		add(reg);
		
		Icon a = new ImageIcon(getClass().getResource("image1.png"));
		Icon b = new ImageIcon(getClass().getResource("image2.png"));

		custom = new JButton("Custom", a);
		custom.setRolloverIcon(b);
		add(custom);
		
		HandlerClass handler = new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
		
	}
	
	private class HandlerClass implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
		}
	}
}


/*
	public static void main(String args[]) {
		System.out.println("****   START of program  *****");
		PGui gui = new PGui();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(350, 250);
		gui.setVisible(true);
		System.out.println("****   END of program  *****");		
	}

*/