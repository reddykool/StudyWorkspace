import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;


public class PReadFile extends JFrame {
	private JTextField addressBar;
	private JEditorPane display;
	
	public PReadFile() {
		super("Redz Browser");
		
		addressBar = new JTextField("Enter URL !");
		addressBar.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent event) {
						loadWebPage(event.getActionCommand());
					}
				}
			);
		add(addressBar, BorderLayout.NORTH);
		
		display = new JEditorPane();
		display.setEditable(false);
		display.addHyperlinkListener(
				new HyperlinkListener() {
					public void hyperlinkUpdate(HyperlinkEvent event) {
						if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED) {
						    loadWebPage(event.getURL().toString());
						}
					}
				}
		    );
		//add(display, BorderLayout.CENTER);
		
		add(new JScrollPane(display), BorderLayout.CENTER);
		setSize(500,400);
		setVisible(true);
	}
	
	private void loadWebPage(String urlStr) {
		try {
			display.setPage(urlStr);
			addressBar.setText(urlStr);
		} catch (Exception e) {
			System.out.println("Crap !@#$@$#");
		}
	}
	
}

/*
public class MainForAll {
	public static void main(String args[]) {
		System.out.println("****   START of program  *****");
		PReadFile obj = new PReadFile();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		System.out.println("****   END of program  *****");		
	}

}
*/