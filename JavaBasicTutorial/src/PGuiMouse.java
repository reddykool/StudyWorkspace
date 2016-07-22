import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import org.xml.sax.HandlerBase;

public class PGuiMouse extends JFrame {
	private JPanel mousePanel;
	private JLabel statusBar;
	
	public PGuiMouse() {
		super("Puru Mouse Events");
		
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.WHITE);
		add(mousePanel, BorderLayout.CENTER);
		
		statusBar = new JLabel("Use Mouse...");
		add(statusBar, BorderLayout.SOUTH);
		
		HandlerClass handler = new HandlerClass();
		mousePanel.addMouseListener(handler);
		mousePanel.addMouseMotionListener(handler);
	}
	
	private class HandlerClass implements MouseListener, MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			statusBar.setText("You dragged the Mouse");	
			mousePanel.setBackground(Color.BLUE);
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			statusBar.setText("You moved the Mouse");			
			//mousePanel.setBackground(Color.ORANGE);
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			statusBar.setText(String.format("Clicked at (%d,%d)", e.getX(), e.getY()));			
			mousePanel.setBackground(Color.GREEN);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			statusBar.setText("You Pressed the Mouse");			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			statusBar.setText("You release the Mouse");			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			statusBar.setText("Mouse entered the window");
			mousePanel.setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			statusBar.setText("Mouse Exited the window");
			mousePanel.setBackground(Color.WHITE);			
		}
		
	}

}


/*
public static void main(String args[]) {
	System.out.println("****   START of program  *****");
	PGuiMouse obj = new PGuiMouse();
	obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	obj.setSize(300, 300);
	obj.setVisible(true);
	System.out.println("****   END of program  *****");	
}
*/