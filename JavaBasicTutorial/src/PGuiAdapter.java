import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PGuiAdapter extends JFrame{
	private String details;
	private JLabel statusbar;
	
	public PGuiAdapter() {
		super("Adapter !?!");
		
		statusbar = new JLabel("Use Mouse...");
		add(statusbar, BorderLayout.SOUTH);
		
		addMouseListener(new MouseClass());
	}
	
	private class MouseClass extends MouseAdapter {
		public void mouseClicked(MouseEvent event) {
			details = String.format("You clicked %d ",event.getClickCount());
			
			if(event.isMetaDown()) {
				details += "  With RIGHT mouse button";
			}
			else if(event.isAltDown()) {
				details += "  With CENTER mouse button";
			}
			else
				details += "  With LEFT mouse Button";
			
			statusbar.setText(details);
		}
	}

}

/*
public static void main(String args[]) {
	System.out.println("****   START of program  *****");
	PGuiAdapter obj = new PGuiAdapter();
	obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	obj.setSize(300, 300);
	obj.setVisible(true);
	System.out.println("****   END of program  *****");	
}
*/