import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class PEvent extends JFrame {
	
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	
	private JPasswordField pwd;
	
	public PEvent() {
		super("Redz input");
		setLayout(new FlowLayout());
		
		txt1 = new JTextField(10);
		add(txt1);
		
		txt2 = new JTextField("Enter text here");
		add(txt2);
		
		txt3 = new JTextField("Password", 20);
		txt3.setEditable(false);
		add(txt3);
		
		pwd = new JPasswordField("mypass");
		add(pwd);
		
		theHandler handler = new theHandler();
		txt1.addActionListener(handler);
		txt2.addActionListener(handler);
		txt3.addActionListener(handler);
		pwd.addActionListener(handler);
	}
	
	private class theHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String string = "";
			if(event.getSource()==txt1) 
				string = String.format("Field 1 :%s", event.getActionCommand());
			else if(event.getSource()==txt2) 
				string = String.format("Field 2 :%s", event.getActionCommand());
			if(event.getSource()==txt3) 
				string = String.format("Field 3 :%s", event.getActionCommand());
			if(event.getSource()==pwd) 
				string = String.format("Pwd Field  :%s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, string);
		}
		
	}

}



/*
 * public static void main(String args[]) {
		System.out.println("****   START of program  *****");
		PEvent eventObj = new PEvent();
		eventObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		eventObj.setSize(400, 200);
		eventObj.setVisible(true);
	    System.out.println("****   END of program  *****");		
	}
 */

