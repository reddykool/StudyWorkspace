import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class PGuiComboBox extends JFrame{
	private JComboBox box;
	private JLabel pic;
	
	private static String[] fileName = {"Select...","image1.png","image2.png"};
	private Icon[] pics = { null,
							new ImageIcon(getClass().getResource(fileName[1])), 
			                new ImageIcon(getClass().getResource(fileName[2]))
			              };
	
	public PGuiComboBox() {
		super("Puru Combo Box");
		setLayout(new FlowLayout());
		
		box = new JComboBox(fileName);
		add(box);
		
		/*
		HandlerClass handle = new HandlerClass();
		box.addItemListener(handle);
		*/
		
		//Create quick anonymous class instead of another new inner class
		box.addItemListener(
				new ItemListener() {
					public void itemStateChanged(ItemEvent event) {
						System.out.println("Selected");
						if(event.getStateChange() == ItemEvent.SELECTED) {
							pic.setIcon(pics[box.getSelectedIndex()]);
							}
						}
					}
				);
		
		pic = new JLabel();
		add(pic);
	}
	
	/*
	private class HandlerClass implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent event) {
			System.out.println("Selected");
			if(event.getStateChange() == ItemEvent.SELECTED) {
				pic.setIcon(pics[box.getSelectedIndex()]);
			}
			
		}
		
	}
	*/

}

/*
public static void main(String args[]) {
		System.out.println("****   START of program  *****");
		PGuiComboBox eventObj = new PGuiComboBox();
		eventObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		eventObj.setSize(400, 200);
		eventObj.setVisible(true);
		System.out.println("****   END of program  *****");		
	}
*/