
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class PGuiSimple extends JFrame {
	private JLabel item1;
	
	public PGuiSimple() {
		super("Title bar");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("THis is new label");
		item1.setToolTipText("Show on hover");
		add(item1);
	}
}


/*
 * public static void main(String args[]) {
 		System.out.println("****   START of program  *****");
		PGuiSimple Obj = new PGuiSimple();
		Obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Obj.setSize(400, 200);
		Obj.setVisible(true);
		System.out.println("****   END of program  *****");		
	}
 */
