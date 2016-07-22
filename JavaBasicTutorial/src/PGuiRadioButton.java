import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PGuiRadioButton extends JFrame {
	private JTextField textField;
	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;
	
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	
	private ButtonGroup bGroup;
	
	private Boolean seperateHandlerObjects;
	
	public PGuiRadioButton () {
		super("Puru Radio Butotns");
		setLayout(new FlowLayout());
		
		textField = new JTextField("Puru is a Millionaire");
		add(textField);
		
		pb = new JRadioButton("Plain", true);
		bb = new JRadioButton("Bold", false);
		ib = new JRadioButton("Italic", false);
		bib = new JRadioButton("Bold & Italic", false);
		
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
		bGroup = new ButtonGroup();
		
		bGroup.add(pb);
		bGroup.add(bb);
		bGroup.add(ib);
		bGroup.add(bib);
		
		
		pf = new Font("Serif", Font.PLAIN, 14);
		bf = new Font("Serif", Font.BOLD, 14);
		itf = new Font("Serif", Font.ITALIC, 14);
		bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);		
		
		textField.setFont(pf);
		
		seperateHandlerObjects = true;
		
		if(seperateHandlerObjects) {
			pb.addItemListener(new HandlerClass(pf));
			bb.addItemListener(new HandlerClass(bf));
			ib.addItemListener(new HandlerClass(itf));
			bib.addItemListener(new HandlerClass(bif));
		}
		else {
			HandlerClass2 handle = new HandlerClass2();
			pb.addItemListener(handle);
			bb.addItemListener(handle);
			ib.addItemListener(handle);
			bib.addItemListener(handle);
		}
	}
	
	private class HandlerClass implements ItemListener {
		private Font font;
		public HandlerClass (Font f) {
			font = f;
		}
		
		public void itemStateChanged(ItemEvent event) {
			System.out.println("HandlerClass item changed Event...");
			textField.setFont(font);
		}
	}
	
	private class HandlerClass2 implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			System.out.println("HandlerClass2 item changed Event...");
			if(event.getSource()==pb) {
				textField.setFont(pf);
			}
			else if(event.getSource()==bb) {
				textField.setFont(bf);
			}
			else if(event.getSource()==ib) {
				textField.setFont(itf);
			}
			else if(event.getSource()==bib) {
				textField.setFont(bif);
			}
		}
	}
}

/*
public static void main(String args[]) {
	System.out.println("****   START of program  *****");
	PGuiRadioButton obj = new PGuiRadioButton();
	obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	obj.setSize(300, 300);
	obj.setVisible(true);
	System.out.println("****   END of program  *****");	
}
*/
