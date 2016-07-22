import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PGuiCheckBox extends JFrame{
	private JTextField textField;
	private JCheckBox boldBox;
	private JCheckBox italicBox;
	
	public PGuiCheckBox () {
		super("Puru Box");
		setLayout(new FlowLayout());
		
		textField = new JTextField("This is a sentence", 20);
		textField.setFont(new Font("Serif", Font.PLAIN, 14));
		add(textField);
		
		boldBox = new JCheckBox("Boldd");
		italicBox = new JCheckBox("Italicaa");
		add(boldBox);
		add(italicBox);
		
		
		HandlerClass handler = new HandlerClass();
		boldBox.addItemListener(handler);
		italicBox.addItemListener(handler);
						
	}
	
	private class HandlerClass implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			Font font = null;
			if(boldBox.isSelected() && italicBox.isSelected()) {
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			}
			else if(boldBox.isSelected()) {
				font = new Font("Serif", Font.BOLD, 14);
			}
			else if(italicBox.isSelected()) {
				font = new Font("Serif", Font.ITALIC, 14);
			}
			else {
				font = new Font("Serif", Font.PLAIN, 14);
			}
			textField.setFont(font);
		}

	}
	
}

/*

public static void main(String args[]) {
		System.out.println("****   START of program  *****");
		PGuiCheckBox eventObj = new PGuiCheckBox();
		eventObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		eventObj.setSize(400, 200);
		eventObj.setVisible(true);
		System.out.println("****   END of program  *****");
	}


*/