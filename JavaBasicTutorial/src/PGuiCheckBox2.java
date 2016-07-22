import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PGuiCheckBox2 extends JFrame{
	private JTextField textField;
	private JCheckBox boldBox;
	private JCheckBox italicBox;
	Boolean isBold;
	Boolean isItalic ;
	
	public PGuiCheckBox2 () {
		super("Puru Box");
		setLayout(new FlowLayout());
		
		textField = new JTextField("This is a sentence", 20);
		textField.setFont(new Font("Serif", Font.PLAIN, 14));
		add(textField);
		isBold = false;
		isItalic =false;
		
		boldBox = new JCheckBox("Boldd");
		italicBox = new JCheckBox("Italicaa");
		add(boldBox);
		add(italicBox);
		
		HandlerClass handler = new HandlerClass();
		textField.addActionListener(handler);
		boldBox.addActionListener(handler);
		italicBox.addActionListener(handler);
	}
	
	private class HandlerClass implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println(event.getActionCommand()+ " is (De)Selected");
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
	
	/* More step vise and debugging code below *
	/*
	private class HandlerClass implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Object obj = event.getSource();
			if(obj.equals(boldBox)){
				if(boldBox.isSelected()) {
					isBold = true;
					System.out.println("Bold Selected");
					if(isItalic) {
						textField.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, 14));
					}
					else {
						textField.setFont(new Font("Serif", Font.BOLD, 15));
					}
					JOptionPane.showMessageDialog(null, String.format("Bold selected"));
				}
				else {
					isBold = false;
					System.out.println("Bold DE-Selected");
					if(isItalic) {
						textField.setFont(new Font("Serif", Font.PLAIN|Font.ITALIC, 14));						
					} 
					else {
						textField.setFont(new Font("Serif", Font.PLAIN, 14));						
					}
					JOptionPane.showMessageDialog(null, String.format("Bold DE-selected"));					
				}				
			}
			else if(obj.equals(italicBox)) {
				if(italicBox.isSelected()){
					isItalic = true;
					System.out.println(" Italic Selected");
					if(isBold) {
						textField.setFont(new Font("Serif", Font.ITALIC|Font.BOLD, 14));						
					}
					else {
						textField.setFont(new Font("Serif", Font.ITALIC, 14));
					}
					JOptionPane.showMessageDialog(null, String.format("Italic selected"));					
				}
				else {
					isItalic = false;
					System.out.println(" Italic DE-Selected");
					if(isBold) {
						textField.setFont(new Font("Serif", Font.PLAIN|Font.BOLD, 14));
					}
					else {
						textField.setFont(new Font("Serif", Font.PLAIN, 14));						
					}
					JOptionPane.showMessageDialog(null, String.format("Italic DE-selected"));
				}
			}
			else if(obj.equals(textField)){
				System.out.println(" Text Selected");
				textField.setText("Ok... Enter new message");
			}
		}
	}
	*/
}

/*
public static void main(String args[]) {
	System.out.println("****   START of program  *****");
	PGuiCheckBox2 obj = new PGuiCheckBox2();
	obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	obj.setSize(300, 300);
	obj.setVisible(true);
	System.out.println("****   END of program  *****");	
}
*/